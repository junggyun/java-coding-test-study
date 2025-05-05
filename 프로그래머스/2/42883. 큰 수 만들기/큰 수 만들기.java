class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int targetSize = number.length() - k;
        int index = 0;
        for (int i = 1; i <= targetSize; i++) {
            int max = 0;
            for (int j = index; j < i + k; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    index = j + 1;
                }
            }
            sb.append(String.valueOf(max));
        }
        return sb.toString();
    }
}