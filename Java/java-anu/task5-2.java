class hello {
    public static void main(String args[])
    {
        
        StringBuilder build = new StringBuilder("Hello");
        build.append(" World");
        System.out.println("After append: " + build); 
        build.insert(6, "Java ");
        System.out.println("After insert: " + build); 
        build.replace(6, 10, "Wonderful");
        System.out.println("After replace: " + build);  
        build.delete(6, 15);
        System.out.println("After delete: " + build); 
    }
}
