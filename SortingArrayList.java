import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SortingArrayList - bubble sort
 */
public class SortingArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 12, 31, 4, 25, 6, 27, 8, 49));

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
                list.forEach(data -> System.out.print("\t"+data));
                System.out.println();
            }
            System.out.println("next iteration:");
        }

        for (int i : list) {
            System.out.println(i);
        }

    }
}