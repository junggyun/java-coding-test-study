import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        System.out.println(solution(N, K));
    }
    static int solution(int N, int K) {
        int answer = 0;

        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                divisors.add(i);
                if (i != N / i) divisors.add(N / i);
            }
        }

        if (divisors.size() >= K) {
            Collections.sort(divisors);
            answer = divisors.get(K - 1);
        }
        return answer;
    }

}
