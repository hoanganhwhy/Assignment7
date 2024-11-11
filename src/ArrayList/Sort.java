
package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Sort {
       public static void main(String[] args) {
        ArrayList<Integer> unsortedList = new ArrayList<>();
        Collections.addAll(unsortedList, 5, 3, 8, 2, 4);
        Collections.sort(unsortedList);
        System.out.println("Sorted list: " + unsortedList);
    }
}
