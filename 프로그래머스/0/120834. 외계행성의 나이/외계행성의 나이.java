class Solution {
    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);
        for (char ch : str.toCharArray()) {
            answer += (char) (Integer.parseInt(String.valueOf(ch)) + 97);
        }
        return answer;
    }
}