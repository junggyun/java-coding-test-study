class Solution {
    static int[] dp;
    public int solution(int n) {
        dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        return fibo(n);
    }
    
    static int fibo(int n) {
        if (n == 2) return 1;
        if (dp[n - 2] == 0) {
            dp[n - 2] = fibo(n - 2);
        }
        if (dp[n - 1] == 0) {
            dp[n - 1] = fibo(n - 1);
        }
        return (dp[n - 2] + dp[n - 1]) % 1234567;
    }
}