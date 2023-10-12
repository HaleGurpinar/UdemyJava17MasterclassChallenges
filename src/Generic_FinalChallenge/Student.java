package Generic_FinalChallenge;

import java.util.Random;

public class Student {

    private String name;
    public String course;
    private int yearStarted;

    protected  static Random random= new Random();

    private static String[] firstnames= {"Ann","Bill","Cathy","John","Tim"};
    private static String[] courses= {"C++","Java","Python"};

    public Student(){
        int lastNameIndex= random.nextInt(65,91);
        name= firstnames[random.nextInt(5)]+ " "+ (char) lastNameIndex;
        course=courses[random.nextInt(3)];
        yearStarted= random.nextInt(2018,2023);
    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name,course,yearStarted) ;
    }

    public int getYearStarted() {
        return yearStarted;
    }
}
