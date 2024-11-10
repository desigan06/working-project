class Area{
    public double triangle(double base, double height) {
        return 1.5 * base * height;
    }

    public double rectangle(double length, double breadth) {
        return length * breadth;
    }

    public double circle(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Area calculator = new Area();
        
        System.out.println("Area of Triangle : " + calculator.triangle(10, 5));
        System.out.println("Area of Rectangle : " + calculator.rectangle(4, 5));
        System.out.println("Area of Circle : " + calculator.circle(7));
    }
}
