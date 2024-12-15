import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] before = my_string.trim().split(" ");
        List<String> list = new ArrayList<>();
        for (String str : before) {
            if (str.length() > 0) list.add(str);
        }
        String[] answer = new String[list.size()];
        list.toArray(answer);
        
        return answer;
    }
}