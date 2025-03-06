class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        
        int index = code - 1;
        while (index < cipher.length()) {
            sb.append(String.valueOf(cipher.charAt(index)));
            index += code;
        }
        
        return sb.toString();
    }
}