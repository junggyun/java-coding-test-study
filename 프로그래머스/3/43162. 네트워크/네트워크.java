class Solution {
    static boolean[] visited;
    static int[][] graph;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        graph = computers;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;;
            }
        }
        return answer;
    }
    
    static void dfs(int target) {
        visited[target] = true;
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i] && graph[target][i] == 1) {
                dfs(i);
            }
        }
    }
}