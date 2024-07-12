package OOP;

public class Circle1 {
    private double radius;
    private String color;

    public Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Круг: радиус = " + radius + ", цвет = " + color +
                ", площадь = " + area() + ", периметр = " + perimeter();
    }

}