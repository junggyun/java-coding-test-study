class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            answer += divisorCount(i) > limit ? power : divisorCount(i);
        }
        
        return answer;
    }
    
    static int divisorCount(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
                if (number / i != i ) {
                count ++;
                }
            }
        }
        return count;
    }
}