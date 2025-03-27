class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        
        int startSection = section[0];
        for (int i = 1; i < section.length; i++) {
            if (section[i] > startSection + (m - 1)) {
                answer++;
                startSection = section[i];
            }
        }
        
        return answer;
    }
}