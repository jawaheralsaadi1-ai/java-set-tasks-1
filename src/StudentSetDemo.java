import java.util.HashSet;
import java.util.Set;


public class StudentSetDemo {
    public static void main(String[] argus) {
        Set<String> stdNames = new HashSet<>();
        stdNames.add("STD1");
        stdNames.add("STD2");
        stdNames.add("STD3");
        stdNames.add("STD4");
        stdNames.add("STD5");
        System.out.println("Task 7 : origin Set : " + stdNames);
        stdNames.add("STD1");
        stdNames.add("STD2");
        System.out.println(" Set after add 2 duplicate names : " + stdNames);
        System.out.println("check Student name 'STD4' exists or not : " + stdNames.contains("STD4"));
stdNames.remove("STD5");
        System.out.println("Set After removing 'STD5'  : " + stdNames);
        System.out.println("Total number of Students names  : " + stdNames.size());
        stdNames.clear();
        System.out.println("Set After Clearing  : " + stdNames);
        System.out.println("Total number of Students After Clearing : " + stdNames.size());




    }
}