package Streams_TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Course pymc = new Course("PYMC","Python Masterclass");
        Course jmc= new Course("JMC","Java Masterclass");
//        Student maria = new Student("TR", 2024,26, "F",true,jmc,pymc);
//        System.out.println(maria);
//
//        maria.watchLecture("JMC",8,5,2023);
//        maria.watchLecture("PYMC",6,3,2024);
//        System.out.println(maria);

//-------------------------------------------------------------------------------------
//        Stream.generate(()-> Student.getRandomStudent(jmc,pymc))
//                .limit(10)
//                .forEach(System.out::println);

//-------------------------------------------------------------------------------------
// var femaleStudents = Stream.generate(
//         ()-> Student.getRandomStudent(jmc,pymc))
//         .limit(1000);
//
// femaleStudents =femaleStudents.filter(s -> s.getGender().equals("F"));
//        System.out.println("# of female students " + femaleStudents.count());

//------------------------------------------------------------------------------
        Student[] students = new Student[1000];
        Arrays.setAll(students,(i)-> Student.getRandomStudent(jmc,pymc));

        var femaleStudents = Arrays.stream(students)
                .filter(s -> s.getGender().equals("F"));
        System.out.println("# of female students " + femaleStudents.count());

        for (String gender : List.of("M","F")){
            var myStudents = Arrays.stream(students)
                    .filter(s -> s.getGender().equals(gender));
            System.out.println("# of " + gender +" students "+ myStudents.count());
        }


        List<Predicate<Student>> list = List.of(
                (s)-> s.getAge()<30,
                (Student s) -> s.getAge() >=30 && s.getAge() <60
        );
        long total= 0;
        for (int i=0; i<list.size();i++){
          var myStudents = Arrays.stream(students).filter(list.get(i));
          long cnt = myStudents.count();
          total += cnt;
            System.out.printf("# of students (%s) = %d%n",
                    i==0 ? " < 30" : ">=30 & < 60", cnt);
        }
        System.out.println("# of students >=60 = "+ (students.length - total));

         var ageStream = Arrays.stream(students).
                 mapToInt(Student::getAgeEnrolled);
        System.out.println("Stats for Enrollment Age = " +
                ageStream.summaryStatistics());

        var currentAgeStream = Arrays.stream(students).
                mapToInt(Student::getAge);
        System.out.println("Stats for Current Age = " +
                currentAgeStream.summaryStatistics());

        Arrays.stream(students)
                .map(Student::getCountryCode)
                .distinct()
                .sorted()
                .forEach(s-> System.out.print(s + " "));

        System.out.println();

        //Is there any long term students?
        boolean longTerm = Arrays.stream(students)
                .anyMatch(s-> (s.getAge() - s.getAgeEnrolled() >= 7) &&
                        (s.getMonthsSinceActive()< 12));
        System.out.println("Long Term Students ?" + longTerm);

        //How many long term students?
        long longTermCount = Arrays.stream(students)
                .filter(s-> (s.getAge() - s.getAgeEnrolled() >= 7) &&
                        (s.getMonthsSinceActive()< 12))
                        .count();
        System.out.println("Long Term Students ?" + longTermCount);

         Arrays.stream(students)
                .filter(s-> (s.getAge() - s.getAgeEnrolled() >= 7) &&
                        (s.getMonthsSinceActive()< 12))
                 .filter(s -> !s.hasProgrammingExperience())
                 .limit(5)
                .forEach(System.out::println);
    }
}
