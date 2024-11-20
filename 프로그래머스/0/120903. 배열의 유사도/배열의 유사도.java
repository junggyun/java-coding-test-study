class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String word: s1) {
            for (String compare: s2) {
                if (word.equals(compare)) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}