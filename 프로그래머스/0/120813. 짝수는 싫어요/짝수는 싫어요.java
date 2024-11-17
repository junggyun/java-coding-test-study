class Solution {
    public int[] solution(int n) {
        int[] answer;
        if (n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[n / 2 + 1];
        }
        for (int i = 0; i < answer.length; i++) {
            if (i == 0) answer[i] = 1;
            else answer[i] = answer[i - 1] + 2;
        }
        return answer;
    }
}