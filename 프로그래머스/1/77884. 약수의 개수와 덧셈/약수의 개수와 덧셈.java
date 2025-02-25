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
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
                if (i != number / i) count++;
            }
        }
        return count;
    }
}