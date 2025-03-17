class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char targetChar = s.charAt(i);
            if (Character.isLowerCase(targetChar)) {
                sb.append(targetChar + n > 122 ? (char) (targetChar + n - 26) : (char) (targetChar + n));
            } else if (Character.isUpperCase(targetChar)) {
                sb.append(targetChar + n > 90 ? (char) (targetChar + n - 26) : (char) (targetChar + n));
            } else {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}