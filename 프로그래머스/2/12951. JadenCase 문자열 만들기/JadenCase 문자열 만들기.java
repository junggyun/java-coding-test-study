class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        String[] arr = s.split("");
        String temp = " ";
        for (String str : arr) {
            sb.append(temp.equals(" ") ? str.toUpperCase() : str.toLowerCase());
            temp = str;
        }
        
        return sb.toString();
    }
}