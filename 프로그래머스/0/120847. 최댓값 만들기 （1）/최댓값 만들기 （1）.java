class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int count = 0;
        for (int i = numbers.length - 1; i > 0; i--) {
            int max = 0;
            int tmp = 0;
            for (int j = count; j < numbers.length; j++) {
                if (max < numbers[j]) {
                    max = numbers[j];
                    tmp = j;
                }
            }
            numbers[tmp] = numbers[count];
            numbers[count++] = max;
        }
        answer = numbers[0] * numbers[1];
        
        return answer;
    }
}