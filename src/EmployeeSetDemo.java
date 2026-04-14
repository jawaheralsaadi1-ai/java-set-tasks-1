
import java.util.HashSet;
import java.util.Set;


public class EmployeeSetDemo {
    public static void main(String[] argus) {
        Set<String> empIDs = new HashSet<>();
        empIDs.add("A1001");
        empIDs.add("A1002");
        empIDs.add("A1003");
        empIDs.add("A1004");
        empIDs.add("A1005");
        System.out.println("Task 7 : Origin Set : " + empIDs);
        empIDs.add("A1002");
        empIDs.add("A1003");
        System.out.println(" Set After Add 2 duplicate ID : " + empIDs);
        System.out.println(" Set to check 'A1001' excite or not : " + empIDs.contains("A1001"));
        empIDs.remove("A1003");
        System.out.println(" Set After Remove 'A1003' ID : " + empIDs);
        System.out.println(" check excite or not After Remove 'A1003' ID : " + empIDs.contains("A1003"));

        System.out.println(" The total number of Set of Set : " + empIDs.size());
        empIDs.clear();
        System.out.println(" The  Set after clearing : " + empIDs);
        System.out.println(" The size of Set After Clearing : " + empIDs.size());

//*
//we used Methods such as add() , contains(), remove(), size(), and Clear()
// in one program
// */

    }}
