public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        double a=circle.getRadius();
        double b=circle.getArea();
        double c=circle.getPerimeter();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        circle = new Circle(4,"red",false);
        System.out.println(circle);

    }
}