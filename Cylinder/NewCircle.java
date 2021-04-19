public class NewCircle {
    private double radius;
    private String color;

    public NewCircle() {
    }

    public NewCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "NewCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
