public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint=new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint=new MoveablePoint(12,5);
        System.out.println(moveablePoint);
        moveablePoint=new MoveablePoint(1,5,1,9);
        System.out.println(moveablePoint);
    }
}
