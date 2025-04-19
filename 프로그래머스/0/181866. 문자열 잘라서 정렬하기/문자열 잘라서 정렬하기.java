import java.util.*;

class Solution {
    public String[] solution(String myString) {
        StringBuilder sb = new StringBuilder();
        String temp = "x";
        for (String str : myString.split("")) {
            if (!(temp.equals("x") && str.equals("x"))) {
                sb.append(str);
                temp = str;
            }
            
        }
        String[] answer = sb.toString().split("x");
        Arrays.sort(answer);
        return answer;
    }
}