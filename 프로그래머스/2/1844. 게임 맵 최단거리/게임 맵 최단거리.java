import java.util.*;

class Solution {
    private static int n, m;
    private static int[] dx, dy;
    private static int[][] graph;
    
    public int solution(int[][] maps) {
        graph = maps;
        n = maps.length;
        m = maps[0].length;
        
        dx = new int[]{0, 0, 1, -1};
        dy = new int[]{1, -1, 0, 0};     
        
        return bfs(0, 0);
    }
    
    private static int bfs(int a, int b) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{a, b});
        
        while (!q.isEmpty()) {
            int x = q.peek()[0];
            int y = q.peek()[1];
            q.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (graph[nx][ny] == 0) continue;
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
        return graph[n - 1][m - 1] == 1 ? -1 : graph[n - 1][m - 1];
    }
}