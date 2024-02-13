package Task3;

public class Triangle extends  Shape{
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        double square = 0.5 * height * side;
        System.out.println(square);
    }
}
