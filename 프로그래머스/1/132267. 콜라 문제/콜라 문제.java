class Solution {
    public int solution(int a, int b, int n) {
        
        return exchange(a, b, n);
    }
    
    static int exchange(int a, int b, int n) {
        int result = n / a * b;
        if (result == 0) return result;
        return result + exchange(a, b, result + (n % a));
    }
}