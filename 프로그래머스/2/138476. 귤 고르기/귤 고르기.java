import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int[] count = new int[10000001];
        for (int num : tangerine) {
            count[num] += 1;
        }
        Arrays.sort(count);
        for (int i = 10000000; i > 0; i--) {
            answer += 1;
            k -= count[i];
            if (k <= 0) break;
        }
        
        return answer;
    }
}