
package ArrayList;
import java.util.ArrayList;

public class Convert {
     public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(22);
        integerList.add(33);
        integerList.add(44);
        integerList.add(55);

        Integer[] array = new Integer[integerList.size()];
        integerList.toArray(array);

        System.out.println("Array elements:");
        for (Integer num : array) {
            System.out.println(num);
        }
    }
}
