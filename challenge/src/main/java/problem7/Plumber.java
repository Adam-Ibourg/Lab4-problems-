package problem7;

public class Plumber extends Person{

    // constructor
    public Plumber(String name){
        super(name);
    }

    @Override
    public void display() {
        System.out.println("I am " + name + " the Plumber");
    }

}
