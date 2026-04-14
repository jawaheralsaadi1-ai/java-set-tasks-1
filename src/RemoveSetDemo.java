import java.util.HashSet;
import java.util.Set;


public class RemoveSetDemo {
    public static void main(String[] argus) {
        Set<String> products = new HashSet<>();
        products.add("Phone");
        products.add("Laptop");
        products.add("Watch");
        products.add("iPad");
        products.add("Headphone");
        System.out.println("Task 4 : Origin Set : " + products);
        products.remove("iPad");
        System.out.println("Set After remove 'iPad' :  " + products);
/*
* Remove Method remove items from the set directly from the set
* */
    }}