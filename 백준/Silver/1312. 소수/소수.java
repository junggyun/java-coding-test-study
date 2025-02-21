import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        System.out.println(solution(A, B, N));
    }
    static int solution(int A, int B, int N) {
        A %= B;
        int result = 0;
        for (int i = 0; i < N; i++) {
            A *= 10;
            result = A / B;
            A %= B;
        }
        return result;
    }
}
