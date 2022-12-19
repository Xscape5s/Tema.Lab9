package Polymorphism;

public class Main {

    public static void main(String[] args) {

        FigureInterface triangle = new Triangle(2f, 2f, 4f, 3f);
        FigureInterface circle = new Circle(4);
        FigureInterface rectangle = new Rectangle(2, 4);

        System.out.println("Triangle perimeter: "+triangle.calculatePerimeter());
        System.out.println("Circle surface: "+circle.calculateSurface());
        System.out.println("Rectangle surface: "+rectangle.calculateSurface());


    }
}
