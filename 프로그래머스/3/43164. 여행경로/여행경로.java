import java.util.*;

class Solution {
    static boolean finished = false;
    
    public String[] solution(String[][] tickets) {
        String[] answer = new String[tickets.length + 1];
        boolean[] visited = new boolean[tickets.length];
        Arrays.sort(tickets, Comparator.comparing((String[] a) -> a[1]));
        
        answer[0] = "ICN";
        dfs(0, "ICN", visited, tickets, answer);
        return answer;
    }
    
    static void dfs(int depth, String target, boolean[] visited, String[][] tickets, String[] answer) {
        if (depth == tickets.length) {
            finished = true;
            return;
        }
        for (int i = 0; i < tickets.length; i++) {
            if (finished) return;
            if (!visited[i] && tickets[i][0].equals(target)) {
                visited[i] = true;
                answer[depth + 1] = tickets[i][1];
                dfs(depth + 1, tickets[i][1], visited, tickets, answer);
                visited[i] = false;
            }
        }
    }
}