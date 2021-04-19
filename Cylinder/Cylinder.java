public class Cylinder extends NewCircle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {

        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public double getTheTich() {
        return Math.pow(getRadius(), 2) * Math.PI * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                ", color= " + getColor() +
                " height= " + height +
                '}';
    }
}
