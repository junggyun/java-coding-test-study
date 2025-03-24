import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> history = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            history.add(score[i]);
            Collections.sort(history);
            answer[i] = i < k ? history.get(0) : history.get(history.size() - k);
        }
        return answer;
    }
}