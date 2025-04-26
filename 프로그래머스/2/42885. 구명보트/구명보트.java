import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        boolean[] visited = new boolean[people.length];
        Arrays.sort(people);
        int temp = 0;
        
        int left = 0;
        for (int right = people.length - 1; right >= left; right--) {
            if (people[right] + people[left] <= limit) {
                left++;
            }
            answer++;
        }
        return answer;
    }
}