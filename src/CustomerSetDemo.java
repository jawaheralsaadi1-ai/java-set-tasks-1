
import java.util.HashSet;
import java.util.Set;


public class CustomerSetDemo {
    public static void main (String [] args){
        Set<String> customerID = new HashSet<>();
        customerID.add("A1001");
        customerID.add("A1002");
        customerID.add("A1003");
        customerID.add("A1004");
        customerID.add("A1005");
        System.out.println(" Task 2 : Normal Set : "+ customerID);

        customerID.add("A1005");
        System.out.println(" Task 2 : Set after duplicate : "+ customerID);
// /*/EXPLANATION
// when I add a duplicate vales "A1005" the Set not Store it
// its only keep the uniqe vales so the size was the same in all result.
// *
    }
}
