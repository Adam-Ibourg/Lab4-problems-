package student;

public class Student extends Person {
    private static final Major DEFAULT_MAJOR = new Major("23", "Computer Science");
    private String cne;
    private Major major;

    // no-args constructor
    public Student(){
        super();
    }

    // initialization constructor
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom, nom, telephone, email);
        this.cne = cne;
        this.major = major;
        if (major != null) major.addStudent(this);
    }

    // constructor with default major
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom, prenom, telephone, email, cne, DEFAULT_MAJOR);
    }

    // Getters
    public String getCne(){
        return cne;
    }

    public Major getMajor() {
        return major;
    }

    // Setters
    public void setCne(String cne) {
        this.cne = cne;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String toString(){
        return String.format("Student: {id = %d, firstName = %s, secondName = %s, phone = %s, email = %s, cne = %s, major = %s}",
                id, firstName, secondName, phone, email, cne, major);
    }

    // display the full name of a student
    public String getFullNameFormatted(){
        return String.format("%s %s", secondName.toUpperCase(), firstName);
    }
}

