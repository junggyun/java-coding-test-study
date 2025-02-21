import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        String S = br.readLine();
        System.out.println(solution(S));
    }
    static String solution(String S) {
        String[] nums = new String[26];
        for (int i = 0; i < 26; i++) {
            nums[i] = Integer.toString(S.indexOf((char) i + 97));
        }
        return String.join(" ", nums);
    }

}
