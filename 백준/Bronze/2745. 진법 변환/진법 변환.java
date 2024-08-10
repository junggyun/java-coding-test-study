import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());


        long result = 0;
        int index = 0;
        for (int i = N.length() - 1; i >= 0; i--) {
            char ch = N.charAt(i);
            int num = 0;
            if (ch >= '0' && ch <= '9') {
                num = ch - '0';
            } else if (ch >= 'A' && ch <= 'Z') {
                num = ch - 55;
            }
        result += (long) (num * Math.pow(B, index++));
        }
        System.out.println(result);
    }
}
