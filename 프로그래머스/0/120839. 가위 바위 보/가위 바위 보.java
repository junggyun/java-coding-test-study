class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (char ch : rsp.toCharArray()) {
            if (ch == '2') answer += "0";
            if (ch == '0') answer += "5";
            if (ch == '5') answer += "2";
        }
        return answer;
    }
}