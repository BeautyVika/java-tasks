package Task3;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double square = Math.PI * Math.pow(radius, 2);
        System.out.println(square);
    }
}
