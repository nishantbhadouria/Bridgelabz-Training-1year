class Circle {
    double radius;

    void calculate() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}

public class circle {
    public static void main(String[] args) {
        Circle c = new Circle();

        c.radius = 5;
        c.calculate();
    }
}