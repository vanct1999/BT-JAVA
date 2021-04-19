public class TestNewCircle {
    public static void main(String[] args) {
        NewCircle newCircle=new NewCircle();
        newCircle.setRadius(2);
        newCircle.setColor("red");
        System.out.println(newCircle);
        double a=newCircle.getArea();
        System.out.println(a);
    }
}
