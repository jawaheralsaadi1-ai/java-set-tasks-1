
import java.util.HashSet;
import java.util.Set;

public class SizeSetDemo {
    public static void main(String[] argus) {
        Set<String> depNames = new HashSet<>();
        depNames.add("IT");
        depNames.add("Engineering");
        depNames.add ("Marketing");
        depNames.add("Technical");
        depNames.add("Finance");
        System.out.println(" Task 5 - Origin Set : " + depNames);
        System.out.println("The total number of elements : " + depNames.size());
        depNames.add ("HR");
        System.out.println("  Set After Add 'HR'  : " + depNames);

        System.out.println("The total number of elements  : " + depNames.size());

    }
}