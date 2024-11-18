import java.util.*;

class Solution {
    public int solution(int[] array) {
        int[] numbers = array;
        Arrays.sort(numbers);
        return numbers[numbers.length / 2];
    }
}