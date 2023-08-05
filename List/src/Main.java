import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("___list___");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1000; i ++) {
            list.add(i);
        }
        list.add(999, 32);
        for (int i : list) {
            System.out.println("this number: " + i);
        }


        List<Integer> result = list
          .stream()
          .filter(x -> x % 2 == 0)
          .collect(Collectors.toList());
        for (int r : result) {
            System.out.println("Esse é numero par: " + r);
        }

    }
}