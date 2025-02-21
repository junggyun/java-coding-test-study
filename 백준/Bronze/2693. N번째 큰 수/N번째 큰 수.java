import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Integer[] nums = new Integer[st.countTokens()];
            for (int j = 0; j < nums.length; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }
            System.out.println(solution(nums));
        }
    }
    static int solution(Integer[] nums) {
        Arrays.sort(nums, Collections.reverseOrder());
        return nums[2];
    }

}
