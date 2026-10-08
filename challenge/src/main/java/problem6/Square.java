package problem6;

public class Square extends Forme{
    private double side;

    // constructor
    public Square(double side){
        this.side = side;
    }

    // getters and setters
    public double getSide(){
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // overriding the getSurface method

    @Override
    public double getSurface() {
        double surface = side * side;
        return Math.round(surface * 100.0) / 100.0;
    }

    // overriding the toString method
    @Override
    public String toString(){
        return String.format("Square (side %.1f cm)", side);
    }
}
