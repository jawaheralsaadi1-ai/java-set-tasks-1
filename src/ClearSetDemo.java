
import java.util.HashSet;
import java.util.Set;


public class ClearSetDemo {
    public static void main(String[] argus) {
        Set<String> tempUser = new HashSet<>();
        tempUser.add ("User1");
        tempUser.add ("User2");
        tempUser.add ("User3");
        tempUser.add ("User4");
        tempUser.add ("User5");
        System.out.println("Task 6 : Set before Clear : " + tempUser);
        System.out.println(" The size of before Clear : " + tempUser.size());
        tempUser.clear();
        System.out.println(" Set After Clearing : " + tempUser);

        System.out.println(" The size of After Clearing : " + tempUser.size());

    }
    // * clear Method Delete all elements at once
    // * so the size after clear become 0
}