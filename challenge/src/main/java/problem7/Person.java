package problem7;

public abstract class Person {
    protected String name;

    // constructor
    public Person(String name){
        this.name = name;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();
}
