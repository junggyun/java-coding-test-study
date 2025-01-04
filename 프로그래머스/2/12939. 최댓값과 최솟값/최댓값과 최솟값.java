import java.util.*;

class Solution {
    public String solution(String s) {
        int[] numbers = new int[s.split(" ").length];
        int index = 0;
        for (String string : s.split(" ")) {
            numbers[index++] = Integer.parseInt(string);
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        return min + " " + max;
    }
}