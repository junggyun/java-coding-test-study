class Solution {
    public int solution(String number) {
        int sum = 0;
        for (char ch: number.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(ch));
        }
        return sum % 9;
    }
}