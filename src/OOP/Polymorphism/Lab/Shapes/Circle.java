package OOP.Polymorphism.Lab.Shapes;

public class Circle extends Shape{

    Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculatePerimeter() {

        perimeter = 2*Math.PI*radius;
        return perimeter;
    }

    @Override
    public Double calculateArea() {

        area = Math.PI*Math.pow(radius,2);
        return area;
    }

    public Double getRadius() {
        return radius;
    }
}
