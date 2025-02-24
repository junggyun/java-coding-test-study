import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException{
        int n = 0;
        while (n != -1) {
            n = Integer.parseInt(br.readLine());
            System.out.println(solution(n));
        }
    }
    static String solution(int n) {
        if (n == -1) return "";
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i && n / i != n) divisors.add(n / i);
            }
        }
        Collections.sort(divisors);
        int sum = 0;
        for (Integer divisor : divisors) {
            sum += divisor;
        }
        if (n == sum) {
            String[] divisorsArray = new String[divisors.size()];
            for (int i = 0; i < divisors.size(); i++) {
                divisorsArray[i] = String.valueOf(divisors.get(i));
            }
            sb = new StringBuilder();
            sb.append(n);
            sb.append(" = ");
            sb.append(String.join(" + ", divisorsArray));
        } else {
            return n + " is NOT perfect.";
        }
        return sb.toString();
    }

}
