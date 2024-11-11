
package ArrayList;
import java.util.ArrayList;

public class Update {
     public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            nums.add(i);
        }
        nums.set(2, 100); 
        System.out.println("Updated list: " + nums);
    }
}
