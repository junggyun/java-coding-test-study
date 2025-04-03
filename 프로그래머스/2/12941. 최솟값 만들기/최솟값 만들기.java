import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Integer[] integerB = new Integer[B.length];
        for (int i = 0; i < B.length; i++) {
            integerB[i] = B[i];
        }
        Arrays.sort(A);
        Arrays.sort(integerB, Comparator.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * integerB[i];
        }

        return answer;
    }
}