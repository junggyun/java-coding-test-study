class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        char temp = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (temp == ' ' && s.charAt(i) != ' ') {
                sb.append(s.substring(i, i + 1).toUpperCase());
            } else if (temp != ' ') {
                sb.append(s.substring(i, i + 1).toLowerCase());
            } else {
                sb.append(s.substring(i, i + 1));
            }
            temp = s.charAt(i);
        }
        
        return sb.toString();
    }
}