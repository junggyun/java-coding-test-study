import java.util.*;

class Solution {
    public int solution(String numbers) {
        Set<Integer> set = new HashSet<>();
        String[] arr = numbers.split("");
        boolean[] visited = new boolean[numbers.length()];
        dfs("", arr, visited, set);
        
        return set.size();
    }
    
    static void dfs(String target, String[] arr, boolean[] visited, Set<Integer> set) {
        if (!target.isEmpty()) {
            if (checkPrime(Integer.parseInt(target))) {
                set.add(Integer.parseInt(target));
            }
        }
        if (target.length() == arr.length) {
            return;
        }
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(target + arr[i], arr, visited, set);
                visited[i] = false;
            }
        }
    }
    
    static boolean checkPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}