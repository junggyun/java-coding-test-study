import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int max = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for (Integer num : nums) {
            set.add(num);
        }
        if (max > set.size()) {
            max = set.size();
        }
        
        return max;
    }
}