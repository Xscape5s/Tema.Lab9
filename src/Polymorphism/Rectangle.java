package Polymorphism;

public class Rectangle implements FigureInterface{

    private float length;
    private float width;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
        System.out.println(toString());
    }

    @Override
    public float calculateSurface() {
        return length*width;
    }

    @Override
    public float calculatePerimeter() {
        return 2*length+2*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
