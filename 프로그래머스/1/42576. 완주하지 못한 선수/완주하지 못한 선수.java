import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String player : completion) {
            if (map.containsKey(player)) {
                map.put(player, map.get(player) + 1);
            } else {
                map.put(player, 1);
            }
        }
        
        for (String player : participant) {
            if (!map.containsKey(player) || map.get(player).equals(0)) {
                answer = player;
            } else {
                map.put(player, map.get(player) - 1);
            }
        }
        
        
        return answer;
    }
}