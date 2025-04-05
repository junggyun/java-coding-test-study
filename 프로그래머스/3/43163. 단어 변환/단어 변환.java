import java.util.*;

class Solution {
    static int answer = 0;
    static boolean finished = false;
    
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        dfs(begin, target, words, visited, 0);
        
        return answer;
    }
    
    static void dfs(String begin, String target, String[] words, boolean[] visited, int count) {
        if (begin.equals(target)) {
            answer = count;
            return;
        }
        for (int i = 0; i < words.length; i++) {
            if (finished) return;
            if (visited[i]) continue;
            int temp = 0;
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) != words[i].charAt(j)) {
                    temp++;
                }
            }
            if (temp == 1) {
                visited[i] = true;
                dfs(words[i], target, words, visited, count + 1);
                visited[i] = false;
            }
        }
    }
}