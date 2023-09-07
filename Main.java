import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
    public static ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

    public static void main(String[] args) {

        solution();


    }

    public static void solution() {
        for (int i = 0; i < intList.size()-1; i++) {
            if (intList.get(i) <= 0) {
                intList.remove(i);
                i--;
            }
        }
        Collections.sort(intList);
        for (int i: intList)
            System.out.println(i);

    }
}