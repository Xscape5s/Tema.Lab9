package Polymorphism;

public class Triangle implements FigureInterface{

    private float side1;
    private float side2;
    private float base;
    private float height;

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Triangle(float side1, float side2, float base, float height) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
        this.height = height;
        System.out.println(toString());
    }

    @Override
    public float calculateSurface() {

        return base*height/2;

    }

    @Override
    public float calculatePerimeter() {

        return side1+side2+base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", base=" + base +
                ", height=" + height +
                '}';
    }
}
