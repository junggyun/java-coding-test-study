class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
        answer = str.indexOf(String.valueOf(k)) == -1 ? -1 : str.indexOf(String.valueOf(k)) + 1;
        return answer;
    }
}