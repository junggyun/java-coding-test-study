import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < answer.length; i++) {
            if (map.containsKey(s.charAt(i))) {
                answer[i] = i - map.get(s.charAt(i));
            } else {
                answer[i] = -1;
            }
            map.put(s.charAt(i), i);
        }
        return answer;
    }
}