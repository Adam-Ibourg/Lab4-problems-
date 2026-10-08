package problem6;

public class Circle extends Forme{
    private double radius;

    // constructor
    public Circle(double radius){
        this.radius = radius;
    }

    // getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // overriding the getSurface methode
    @Override
    public double getSurface() {
        double surface = Math.PI * radius * radius;
        return Math.round(surface * 100.0) / 100.0;
    }

    // overriding the toString method
    @Override
    public String toString(){
        return String.format("Circle (radius %.1f cm)", radius);
    }
}
