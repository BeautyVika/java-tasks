package Task3;

/*
Геометрические фигуры:
Реализуйте иерархию классов для геометрических фигур, таких как Circle, Rectangle, и Triangle. Создайте базовый класс Shape,
содержащий общие методы (например, calculateArea()). Затем создайте подклассы для каждой геометрической фигуры.
 */
public class Task3 {
    public static void main (String[] args){
        Circle circle = new Circle(4.0);
        circle.calculateArea();

        Rectangle rectangle = new Rectangle(4, 2);
        rectangle.calculateArea();

        Triangle triangle = new Triangle(4, 6);
        triangle.calculateArea();
    }
}
