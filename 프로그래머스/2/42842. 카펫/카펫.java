class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width = brown + yellow;
        
        for (int i = 3; i <= width / 3; i++) {
            int row = i;
            int col = width / row;
            if (row * col != width) {
                continue;
            }
            if (row >= col && (row - 2) * (col - 2) == yellow) {
                answer[0] = row;
                answer[1] = col;
                break;
            }
        }
        
        return answer;
    }
}