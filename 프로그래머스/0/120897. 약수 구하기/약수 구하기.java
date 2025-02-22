import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) divisors.add(n / i);
            }
        }
        Collections.sort(divisors);
        int[] answer = new int[divisors.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = divisors.get(i);
        }
        return answer;
    }
}