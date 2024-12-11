import java.util.*;

class Solution {
    public String solution(String my_string) {
        List<String> blackList = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
        for (String black : blackList) {
            my_string = my_string.replace(black, "");
        }
        return my_string;
    }
}