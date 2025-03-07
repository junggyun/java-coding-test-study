import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                sb.append(String.valueOf(my_string.charAt(i)));
            }
        }
        int[] answer = new int[sb.toString().length()];
        int index = 0;
        for (String str : sb.toString().split("")) {
            answer[index++] = Integer.parseInt(str);
        }
        Arrays.sort(answer);
        return answer;
    }
}