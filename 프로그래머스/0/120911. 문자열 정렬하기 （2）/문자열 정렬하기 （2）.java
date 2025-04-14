import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.toLowerCase();
        String[] arr = answer.split("");
        Arrays.sort(arr);
        answer = String.join("", arr);
        return answer;
    }
}