package Generic_FinalChallenge;

import java.util.Random;

public class Student implements QueryItem,Comparable<Student>{

    public static int LAST_ID= 10_000;
    private int studentId;
    private String name;
    public String course;
    private int yearStarted;

    protected  static Random random= new Random();

    private static String[] firstnames= {"Ann","Bill","Cathy","John","Tim"};
    private static String[] courses= {"C++","Java","Python"};

    public Student(){
        studentId= LAST_ID++;
        int lastNameIndex= random.nextInt(65,91);
        name= firstnames[random.nextInt(5)]+ " "+ (char) lastNameIndex;
        course=courses[random.nextInt(3)];
        yearStarted= random.nextInt(2018,2023);
    }

    @Override
    public String toString() {
        return "%d %-15s %-15s %d".formatted(studentId,name,course,yearStarted) ;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
       String fname= fieldName.toUpperCase();
       return switch (fname){
           case "NAME" -> name.equalsIgnoreCase(value);
           case "COURSE" -> course.equalsIgnoreCase(value);
           case "YEARSTARTED" -> yearStarted== (Integer.parseInt(value));
           default -> false;
       };
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(studentId).compareTo(o.studentId);
    }
}
