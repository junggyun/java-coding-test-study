import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        boolean possible = false;
        while (!possible) {
            Arrays.sort(wallet);
            Arrays.sort(bill);
            if (wallet[0] >= bill[0] && wallet[1] >= bill[1]) {
                possible = true;
            } else {
                bill[1] /= 2;
                answer++;
            }
        }
        
        return answer;
    }
}