class Solution {
    public int solution(int n) {
        int answer = 0;
        int max = n;
        for (int i = 1; i <= n; i++) {
            if (i == n) answer += 1;
            int sum = i;
            for (int j = 1; j <= max; j++) {
                sum += i + j;
                if (sum >= n) {
                    if (sum == n) answer += 1;
                    max = j;
                    break;
                }
            }
        }
        return answer;
    }
}