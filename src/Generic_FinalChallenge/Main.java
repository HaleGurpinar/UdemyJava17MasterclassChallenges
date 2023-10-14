package Generic_FinalChallenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static Generic_FinalChallenge.QueryList.getMatches;

public class Main {
    public static void main(String[] args) {
        QueryList<LPAStudent> queryList= new QueryList<>();
        for (int i=0;i<25;i++){
            queryList.add(new LPAStudent());
        }

        System.out.println("Ordered");
        queryList.sort(Comparator.naturalOrder());
        printList(queryList);

        System.out.println("Matches");
        var matches=queryList
                .getMatches("PercentComplete", String.valueOf(50))
                .getMatches("Course","Python");

        matches.sort(new LPAComparator());
        printList(matches);

        System.out.println("Ordered");
        matches.sort(null);
        printList(matches);
    }
    public static void printList(List<?> students){
        for (var student: students){
            System.out.println(student);
        }
    }

//    public static void main(String[] args) {
//
//        int studentCount=10;
//        List<Student> students= new ArrayList<>();
//        for (int i=0;i<studentCount;i++){
//            students.add(new Student());
//        }
//        students.add(new LPAStudent());
//        printList(students);
//
//        List<LPAStudent> lpaStudents= new ArrayList<>();
//        for (int i=0;i<studentCount;i++){
//            lpaStudents.add(new LPAStudent());
//        }
//        printList(lpaStudents);
//    }
//
//    public static <T extends Student> void printList(List<T> students){
//
//        for (var student: students){
//            System.out.println(student.getYearStarted()+": "+ student);
//        }
//        System.out.println();
//    }
}
