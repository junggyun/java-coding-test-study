import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer num: nums) {
            set.add(num);
        }
        return Math.min(set.size(), nums.length / 2);
    }
}