class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int last1 = -1;
        int last2 = -1;
        for (int i = 0; i < goal.length; i++) {
            for (int j = 0; j < cards1.length; j++) {
                if (goal[i].equals(cards1[j])) {
                    if (j != last1 + 1) {
                        answer = "No";
                    } else {
                        last1 = j;
                    }
                }
            }
            for (int k = 0; k < cards2.length; k++) {
                if (goal[i].equals(cards2[k])) {
                    if (k != last2 + 1) {
                        answer = "No";
                    } else {
                        last2 = k;
                    }
                }
            }
        }
        
        return answer;
    }
}