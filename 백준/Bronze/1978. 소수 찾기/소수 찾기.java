import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] nums = new int[N];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(nums));
    }
    static int solution(int[] nums) {
        int answer = 0 ;
        for (int i = 0; i < nums.length; i++) {
            if(isPrime(nums[i])) answer += 1;
        }
        return answer;
    }
    static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
