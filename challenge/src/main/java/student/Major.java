package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    // no-args constructor
    public Major(){
        this.id = nextId++;
        this.students = new Student[50];
        this.studentCount = 0;
    }

    // initialization constructor
    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        this.students = new Student[50];
        this.studentCount = 0;
    }

    // getters
    public int getId(){
        return id;
    }

    public String getCode(){
        return code;
    }

    public String getName(){
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getStudentCount() {
        return studentCount;
    }

    // setters
    public void setCode(String code){
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("Major: {id = %d, code = %s, name = %s, studentCount = %d}",
                id, code, name, studentCount);
    }

    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount >= 50){
            System.out.println("A major can't have more than 50 students");
            return;
        }
        students[studentCount++] = s;
    }

    // search fot the student whose cne matches the given value
    public Student findStudentByCNE(String cne){
        for (Student s: students){
            if (s.getCne().equals(cne)) return s;
        }
        return null;
    }

    // remove a student whose cne matches the given value
    public boolean removeStudent(String cne){
        Student s = findStudentByCNE(cne);
        if (s == null) return false;
        for (int i = 0; i < studentCount; i++){
            if (students[i] == s){
                for (int j = i; j < studentCount-1; j++){
                    students[j] = students[j+1];
                }
                students[studentCount-1] = null;
                studentCount--;
            }
        }
        return true;
    }

    // calculate the percentage of occupied capacity
    public double getOccupancyRate(){
        return (double) studentCount * 100 / 50;
    }

    //return a formatted string displaying all students
    public String getStudentListAsString(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < studentCount; i++){
            result.append(String.format("%d. %s %s", (i+1), students[i].getCne(), students[i].getFullNameFormatted()));
            if (i != studentCount-1) result.append('\n');
        }
        return result.toString();
    }

    // Display all students in the major
    public void displayStudents() {
        System.out.println(getStudentListAsString());
    }


}
