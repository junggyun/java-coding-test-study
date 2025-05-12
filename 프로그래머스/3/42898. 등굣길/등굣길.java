class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] graph = new int[n][m];
        graph[0][0] = 1;
        for (int i = 0; i < puddles.length; i++) {
            graph[puddles[i][1] - 1][puddles[i][0] - 1] = -1;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 0) {
                    if (j != 0 && graph[i][j - 1] != -1) {
                        graph[i][j] += graph[i][j - 1];
                    }
                    if (i != 0 && graph[i - 1][j] != -1) {
                        graph[i][j] += graph[i - 1][j];
                    }
                    graph[i][j] %= 1000000007;
                }
            }
        }
        
        return graph[n - 1][m - 1];
    }
}