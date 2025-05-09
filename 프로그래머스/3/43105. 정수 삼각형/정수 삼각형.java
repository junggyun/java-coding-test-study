class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        int[][] cache = new int[triangle.length][];
        for (int i = 0; i < cache.length; i++) {
            cache[i] = new int[i + 1];
        }
        cache[0][0] = triangle[0][0];
        for (int i = 0; i < cache.length - 1; i++) {
            for (int j = 0; j < cache[i].length; j++) {
                cache[i + 1][j] = Math.max(cache[i + 1][j], cache[i][j] + triangle[i + 1][j]);
                cache[i + 1][j + 1] = Math.max(cache[i + 1][j + 1], cache[i][j] + triangle[i + 1][j + 1]);
                answer = Math.max(answer, cache[i + 1][j]);
                answer = Math.max(answer, cache[i + 1][j + 1]);
            }
        }
        
        return answer;
    }
}