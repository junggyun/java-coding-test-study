import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);
        }
        if (checkItems(map, want, number)) {
            answer++;
        }
        for (int i = 0; i < discount.length - 10; i++) {
            map.put(discount[i], map.get(discount[i]) - 1);
            map.put(discount[i + 10], map.getOrDefault(discount[i + 10], 0) + 1);
            if (checkItems(map, want, number)) {
                answer++;
            }   
        }
        return answer;
    }
    
    static boolean checkItems(Map<String, Integer> map, String[] want, int[] number) {
        for (int i = 0; i < want.length; i++) {
            if (map.getOrDefault(want[i], 0) != number[i]) return false;
        }
        return true;
    }
}