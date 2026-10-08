package instructor;

public class Test {
    public static void main(String[] args){
        // creating subject objects
        Subject algebra = new Subject("cs-103", "Algebra");
        Subject algo = new Subject("cs-101", "introduction to algorithms");

        // creating instructor objects
        Instructor ins1 = new Instructor("SAFI", "Amal", "0656251700", "amal@email.com", " AB 123 ", algo);
        Instructor ins2 = new Instructor("ALAMI", "Samir", "0621659982", "samir@gmail.com", " BC   211", algebra);
        Instructor ins3 = new Instructor("SAMI", null, "0755108923", "ghita@gmail.com", "Ef 21", algo);

        // testing methods
        String cleanedEmpNum = ins1.cleanEmployeeNumber();
        System.out.println("The cleaned employee number of the first instructor is: " + cleanedEmpNum);

        String normalizedCode = algo.normalizedCode();
        System.out.println("The normalized code of algo is: " + normalizedCode);

        String properTitle = algo.properTitle();
        System.out.println("The proper title of algo is: " + properTitle);

        String summaryLine = ins2.summaryLine();
        System.out.println("The summary line of the second instructor is: " + summaryLine);

        boolean isIntro = algo.isIntroCourse();
        System.out.println("Is the algo course an introduction course? " + isIntro);

        String card = ins1.toCard();
        System.out.println("The card of the first instructor is:\n" + card);

        String syllabusLine = algebra.syllabusLine(ins2);
        System.out.println("The syllabus line of algebra is:\n" + syllabusLine);

        String name = ins3.displayName();
        System.out.println("Instructor 3's name is: " + name);
    }
}
