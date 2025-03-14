class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            String target = s.substring(i, i + 1);
            if (target.equals(" ")) {
                index = 0;
                sb.append(" ");
            } else {
                sb.append(index % 2 == 0 ? target.toUpperCase() : target.toLowerCase());
                index++;
            }
        }
        
        return sb.toString();
    }
}