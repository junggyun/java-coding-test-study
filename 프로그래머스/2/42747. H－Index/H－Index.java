import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = citations.length;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= answer) break;
            answer--;
        }
        return answer;
    }
}