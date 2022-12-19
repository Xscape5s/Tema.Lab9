package Polymorphism;

public class Circle implements FigureInterface{

    private float radius;
    private final float pi=3.14f;

    public float getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
        System.out.println(toString());
    }

    @Override
    public float calculateSurface() {
        return radius*radius*pi;
    }

    @Override
    public float calculatePerimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}
