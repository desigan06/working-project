document.addEventListener('DOMContentLoaded', () => {
    const chatBox = document.getElementById('chat-box');
    const userInput = document.getElementById('user-input');
    const voiceBtn = document.getElementById('voice-btn');
    const themeToggle = document.getElementById('theme-toggle');
    let isListening = false;
    let recognition;
    let isDarkMode = false;

    function addMessage(content, type) {
        const messageElement = document.createElement('div');
        messageElement.classList.add('chat-message', type);
        messageElement.textContent = content;
        chatBox.appendChild(messageElement);
        chatBox.scrollTop = chatBox.scrollHeight; // Scroll to the bottom
    }

    async function sendMessage() {
        const message = userInput.value.trim();
        if (message === '') return;

        // Display the user's message
        addMessage(message, 'user');

        // Get chatbot response
        setTimeout(async () => {
            const response = await getChatBotResponse(message);
            addMessage(response, 'bot');
        }, 500); // Simulate response delay

        userInput.value = '';
    }

    async function getChatBotResponse(message) {
        const lowerMessage = message.toLowerCase();
        console.log("Received message:", lowerMessage); // Debugging line
    
        if (lowerMessage === 'Artificial Intelligence (AI) has seen rapid advancements in recent years. From machine learning algorithms to neural networks, the field of AI is evolving quickly. These technologies have applications in various industries, including healthcare, finance, and transportation. AI can help automate tasks, improve decision-making, and provide insights from large datasets') return 'AI has rapidly advanced, with applications in healthcare, finance, and transportation, automating tasks and providing valuable insights';
        if (lowerMessage === 'hello') return 'Hello! How can I help you today?';
        if (lowerMessage === 'help') return 'Available commands: hello, help, time, date, search [query], calculate [expression], open calculator, open music player, exit';
        if (lowerMessage === 'time') return new Date().toLocaleTimeString();
        if (lowerMessage === 'date') return new Date().toLocaleDateString();
        if (lowerMessage.startsWith('search ')) {
            const query = lowerMessage.slice(7);
            window.open(`https://www.google.com/search?q=${query}`, '_blank');
            return `Searching Google for: ${query}`;
        }
        if (lowerMessage.startsWith('calculate ')) {
            const expression = lowerMessage.slice(10).trim();
            try {
                const result = eval(expression); // Evaluate the mathematical expression
                return `Result: ${result}`;
            } catch (error) {
                return 'Sorry, there was an error calculating the result.';
            }
        }
        if (lowerMessage === 'open calculator') {
            window.open('https://desiganportfolio.netlify.app/projects/calculator/calculator', '_blank');
            return 'Opening calculator...';
        }
        if (lowerMessage === 'open music player') {
            window.open('https://desiganportfolio.netlify.app/projects/music-player/music-player', '_blank');
            return 'Opening music player...';
        }
        if (lowerMessage === 'exit') return 'Goodbye!';
        return 'Sorry, I do not understand that command.';
    }
    

    function startVoiceRecognition() {
        recognition = new (window.SpeechRecognition || window.webkitSpeechRecognition)();
        recognition.lang = 'en-US';
        recognition.interimResults = false;
        recognition.continuous = false; // Stop listening after each command
    
        recognition.onstart = () => {
            isListening = true;
            voiceBtn.textContent = '🛑'; // Stop icon
        };
    
        recognition.onend = () => {
            isListening = false;
            voiceBtn.textContent = '🎙️'; // Mic icon
        };
    
        recognition.onresult = (event) => {
            const transcript = event.results[0][0].transcript;
            userInput.value = transcript;
            sendMessage(); // Process the message and then stop listening
        };
    
        recognition.onerror = (event) => {
            console.error('Speech recognition error:', event.error);
        };
    
        recognition.start();
    }
    
    function sendMessage() {
        const message = userInput.value.trim();
        if (message === '') return;
    
        // Display the user's message
        addMessage(message, 'user');
    
        // Get chatbot response
        setTimeout(async () => {
            const response = await getChatBotResponse(message);
            addMessage(response, 'bot');
            if (isListening) {
                stopVoiceRecognition(); // Ensure mic stops if listening
            }
        }, 500); // Simulate response delay
    
        userInput.value = '';
    }
    

    function stopVoiceRecognition() {
        if (recognition) {
            recognition.stop();
        }
    }

    function toggleTheme() {
        if (isDarkMode) {
            document.getElementById('theme-style').setAttribute('href', 'light-mode.css');
            themeToggle.textContent = '🌙';
        } else {
            document.getElementById('theme-style').setAttribute('href', 'dark-mode.css');
            themeToggle.textContent = '🌕';
        }
        isDarkMode = !isDarkMode;
    }

    document.querySelector('button').addEventListener('click', sendMessage);
    userInput.addEventListener('keypress', (e) => {
        if (e.key === 'Enter') sendMessage();
    });

    voiceBtn.addEventListener('click', () => {
        if (isListening) {
            stopVoiceRecognition();
        } else {
            startVoiceRecognition();
        }
    });

    themeToggle.addEventListener('click', toggleTheme);
});
