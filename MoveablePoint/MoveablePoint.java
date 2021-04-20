public class MoveablePoint extends Point {
    private float xSpeed = 0.0f, ySpeed = 0.0f;

    MoveablePoint() {
    }

    MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return super.toString()
                + ", speed = "
                + "(" + xSpeed
                + ", " + ySpeed
                + ")";
    }

    public float[] move(float x, float y, float xSpeed, float ySpeed) {
        float x1 = x + xSpeed;
        float y1 = y + ySpeed;
        return new float[]{x1, y1};
    }
}
