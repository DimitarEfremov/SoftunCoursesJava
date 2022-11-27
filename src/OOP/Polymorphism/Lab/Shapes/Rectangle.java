package OOP.Polymorphism.Lab.Shapes;

public class Rectangle extends Shape {


    Double width;
    Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Double calculatePerimeter() {
        perimeter = 2* height + 2*width;
        return perimeter;
    }

    @Override
    public Double calculateArea() {
        area = height*width;
        return area;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }
}
