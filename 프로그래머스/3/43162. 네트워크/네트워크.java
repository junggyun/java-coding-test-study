class Solution {
    private static int[][] graph;
    private static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        graph = computers;
        visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (visited[i] || computers[i][i] == 0) continue;
            dfs(i);
            answer++;
        }
        return answer;
    }
    
    private static void dfs(int x) {
        visited[x] = true;
        for (int i = 0; i < graph[x].length; i++) {
            int y = graph[x][i];
            if (y == 0) continue;
            if (!visited[i]) dfs(i);
        }
    }
    
}