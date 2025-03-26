class Solution {
    public String solution(int a, int b) {
        int[] daySize = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int target = b;
        for (int i = 0; i < a - 1; i++) {
            target += daySize[i];
        }
        
        return days[target % 7];
    }
}