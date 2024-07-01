import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        List<String> list = Arrays.asList(arr);
        String tmp = list.get(1);
        list.set(1, list.get(0));
        list.set(0, tmp);
        System.out.println(list.toString());
    }
}
