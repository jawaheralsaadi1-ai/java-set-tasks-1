import java.util.HashSet;
import java.util.Set;


public class CheckSetDemo {
    public static void main(String[] argus) {
        Set<String> empIDs = new HashSet<>();
        empIDs.add("E1001");
        empIDs.add("E1002");
        empIDs.add("E1003");
        empIDs.add("E1004");
        empIDs.add("E1005");
        System.out.println("Task 3 : EmployeeIDs : " + empIDs);
        System.out.println("Task 3 : Check Employee ID with A1002 : " + empIDs.contains("E1002"));
        System.out.println("Task 3 : Check Employee ID with A1999 : " + empIDs.contains("E1999"));
/*
* Contains() Method return "TRUE" if the Value is there
* and "FALSE" if is not
*
* */
    }
}