import java.util.*;

class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        
        Map<Integer, String> control = new HashMap<>();
        control.put(1, "w");
        control.put(10, "d");
        control.put(-1, "s");
        control.put(-10, "a");
        
        int change = 0;
        for (int i = 0; i < numLog.length - 1; i++ ) {
            change = numLog[i + 1] - numLog[i];
            sb.append(control.get(change));
        }
        
        return sb.toString();
    }
}