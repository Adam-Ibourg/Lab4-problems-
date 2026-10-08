package instructor;
import student.Person;

public class Instructor extends Person {

    private String employeeNumber;
    private Subject subject;

    // no-args constructor
    public Instructor(){ super(); }

    // initialization constructor
    public Instructor(String nom, String prenom, String telephone, String email, String employeeNumber, Subject subject){
        super(prenom, nom, telephone, email);
        this.employeeNumber = employeeNumber;
        this.subject = subject;
    }

    // getters

    public String getEmployeeNumber(){
        return employeeNumber;
    }

    public Subject getSubject() {
        return subject;
    }

    // setters

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString(){
        return String.format("Instructor: {id = %d, firstName = %s, secondName = %s, phone = %s, email = %s, employeeNumber = %s, subject = %s}",
                id, firstName, secondName, phone, email, employeeNumber, subject);
    }

    // trims whitespace and internal space from employeeNumber
    public String cleanEmployeeNumber(){
        if (employeeNumber == null) return null;
        return employeeNumber.trim().replace(" ", "");
    }

    // give a summary about the instructor
    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]", cleanEmployeeNumber(), secondName, firstName);
    }

    // returns a multi line block describing the instructor
    public String toCard(){
        StringBuilder result = new StringBuilder();
        result.append("Instructor\n");
        result.append("----------\n");
        result.append(String.format("Employee #: %s \n", cleanEmployeeNumber()));
        result.append(String.format("Name: %s %s \n", secondName, firstName));
        result.append(String.format("Email: %s \n", email));
        result.append(String.format("Phone: %s \n", phone));
        return result.toString();
    }

    // displays the name safely by handling null cases
    public String displayName(){
        StringBuilder safeName = new StringBuilder();
        if (secondName != null) {
            safeName.append(secondName);
            safeName.append(' ');
        }
        if (firstName != null) safeName.append(firstName);
        return safeName.toString();
    }
}
