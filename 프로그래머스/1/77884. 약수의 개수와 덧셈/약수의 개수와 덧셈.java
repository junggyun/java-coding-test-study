import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (countDivisors(i) % 2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }
    
    static int countDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                divisors.add(i);
                if (i != number / i) divisors.add(number / i);
            }
        }
        return divisors.size();
    }
}