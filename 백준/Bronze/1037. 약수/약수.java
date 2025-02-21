import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] nums = new int[st.countTokens()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(N, nums));
    }
    static int solution(int N, int[] nums) {
        if (N == 1) return (int) Math.pow(nums[0], 2);
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            else if (nums[i] < min) min = nums[i];
        }
        return max * min;
    }

}
