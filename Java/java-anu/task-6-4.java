import java.util.Scanner;

class Student {
    private double[] marks = new double[5];

    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculateAverage() {
        return calculateTotal() / marks.length;
    }

    public char calculateGrade() {
        double average = calculateAverage();
        if (average >= 90) return 'A';
        else if (average >= 75) return 'B';
        else if (average >= 50) return 'C';
        else return 'F';
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.inputMarks();
        System.out.println("Total Marks: " + student.calculateTotal());
        System.out.println("Average Marks: " + student.calculateAverage());
        System.out.println("Grade: " + student.calculateGrade());
    }
}
