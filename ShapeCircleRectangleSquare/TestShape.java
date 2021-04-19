public class TestShape {
    public static void main(String[] args) {
        Shape shape=new Shape();
        String a=shape.getColor();
        System.out.println(a);
        boolean b=shape.isFilled();
        String c=shape.toString();
        System.out.println(b);
        System.out.println(c);

    }
}
