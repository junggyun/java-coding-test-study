class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String feature = binomial.split(" ")[1];
        int num1 = Integer.parseInt(binomial.split(" ")[0]);
        int num2 = Integer.parseInt(binomial.split(" ")[2]);
        if (feature.equals("+")) answer = num1 + num2;
        if (feature.equals("-")) answer = num1 - num2;
        if (feature.equals("*")) answer = num1 * num2;
        return answer;
    }
}