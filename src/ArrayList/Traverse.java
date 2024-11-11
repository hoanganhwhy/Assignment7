
package ArrayList;
import java.util.ArrayList;

public class Traverse {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ha Noi");
        cities.add("Ho Chi Minh");
        cities.add("Tokyo");
        cities.add("Hai Phong");
        cities.add("New York");

        System.out.println("Cities:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
