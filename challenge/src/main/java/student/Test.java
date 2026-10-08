package student;

public class Test {
    public static void main(String[] args) {

        // creating majors
        Major computerScience = new Major("23", "Computer Science");
        Major mathematics = new Major("25", "Math");

        // Display computer science students
        Student s1 = new Student("SAFI", "Amal", "0656251700", "amal@email.com", "22885676", computerScience);
        Student s2 = new Student("SAMI", "Ghita", "0755108923", "ghita@gmail.com", "26108721", mathematics);
        Student s3 = new Student("ALAMI", "Samir", "0621659982", "samir@gmail.com", "23585976", computerScience);

        // Display cs students
        System.out.println("The list of students in the computer science major is: ");
        computerScience.displayStudents();

        // display the cs major's capacity, current enrollment and occupancy rate
        System.out.println("Computer science capacity: " + computerScience.getStudents().length + " students");
        System.out.println("Current enrollment: " + computerScience.getStudentCount() + " students");
        System.out.println("Occupancy rate = " + computerScience.getOccupancyRate() + '%');

        // formatting the full name of a student
        System.out.println("The name of the first student is: " + s1.getFullNameFormatted());

        //finding a student in a major by id
        Student foundByCNE = computerScience.findStudentByCNE("22885676");
        System.out.println("The student having cne = 22885676 in cs major is: ");
        System.out.println(foundByCNE);

        // remove a student by cne
        boolean isRemoved = mathematics.removeStudent("26108721");
        System.out.println("Has the student having cne = 26108721 been deleted? " + isRemoved);



    }
}

