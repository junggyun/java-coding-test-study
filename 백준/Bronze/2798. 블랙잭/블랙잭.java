import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] numbers = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);

        loopOut:
        for (int i = 0; i < N - 2; i++) {
            if (numbers[i] > M) break;
            for (int j = i + 1; j < N - 1; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum > M) break;
                for (int k = j + 1; k < N; k++) {
                    if (sum + numbers[k] == M) {
                        answer = M;
                        break loopOut;
                    }
                    if (sum + numbers[k] > M) break;
                    answer = Math.max(sum + numbers[k], answer);
                }
            }
        }
        System.out.println(answer);
    }
}