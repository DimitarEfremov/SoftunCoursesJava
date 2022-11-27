package OOP.Polymorphism.Lab.Shapes;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(4.00, 5.00);
        Shape circle = new Circle(5.00);

        extract(rectangle);
        extract(circle);


    }



    public static void extract (Shape shape){

        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.calculateArea());

    }

}
