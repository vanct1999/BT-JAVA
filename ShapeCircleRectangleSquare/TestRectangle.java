public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.toString();
        rectangle = new Rectangle(3, 4);
        System.out.println(rectangle);
        rectangle = new Rectangle(3, 4, "red", false);
        double a = rectangle.getArea();
        double b = rectangle.getPerrimeter();
        System.out.println(a);
        System.out.println(b);
        System.out.println(rectangle);
    }
}
