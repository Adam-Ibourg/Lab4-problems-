package instructor;

public class Subject {
    private static int nextId = 1;
    private int id;
    private String code;
    private String title;

    // no-args constructor
    public Subject(){
        nextId++;
    }

    // initializing constructor
    public Subject(String code, String title){
        this.id = nextId++;
        this.code = code;
        this.title = title;
    }

    // getters
    public int getId(){
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    // setters


    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return String.format("Subject: {id = %d, code = %s, title = %s}",
                id, code, title);
    }

    // returns code upper-cased and trimmed
    public String normalizedCode(){
        if (code == null) return null;
        return code.trim().toUpperCase();
    }

    // capitalize the first letter of each word in title
    public String properTitle(){
        if (title == null || title.trim().isEmpty()) return title;
        String[] words = title.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i =  0; i < words.length; i++){
            String word = words[i];
            char firstLetter = word.charAt(0);
            result.append(Character.toUpperCase(firstLetter)).append(word.substring(1));
            if (i != words.length-1) result.append(" ");
        }
        return result.toString();
    }

    // check if a course is an introduction course
    public boolean isIntroCourse(){
        boolean titleMatches = (title != null) && title.toLowerCase().contains("intro");
        boolean codeMatches = (title != null) && title.startsWith("INTRO-");
        return titleMatches || codeMatches;
    }

    // give some info about the syllabus
    public String syllabusLine(Instructor instructor){
        StringBuilder result = new StringBuilder();
        result.append(code).append(" - ").append(title).append(" (Instructor: ")
                .append(instructor.getSecondName()).append(' ').append(instructor.getFirstName()).append(" )");
        return result.toString();
    }
}
