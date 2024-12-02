class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (char ch : my_string.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                answer += String.valueOf(ch).toLowerCase();
            } else {
                answer += String.valueOf(ch).toUpperCase();
            }
        }
        return answer;
    }
}