import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        List<Integer> lostList = new ArrayList<>();
        for (int number : lost) {
            lostList.add(number);
        }
        
        List<Integer> reserveList = new ArrayList<>();
        for (int number : reserve) {
            reserveList.add(number);
        }
        
        for (int number : reserve) {
            if (lostList.contains(number)) {
                lostList.remove(Integer.valueOf(number));
                reserveList.remove(Integer.valueOf(number));
            }
        }
        
        for (Integer number : reserveList) {
            if (lostList.contains(number - 1)) {
                lostList.remove(Integer.valueOf(number - 1));
            } else if (lostList.contains(number + 1)) {
                lostList.remove(Integer.valueOf(number + 1));
            }
        }
        
        return n - lostList.size();
    }
}