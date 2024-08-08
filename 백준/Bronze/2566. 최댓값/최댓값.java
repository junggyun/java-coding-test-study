import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        int[][] arr = new int[9][9];
        int max = 0;
        int first = 0;
        int second = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    first = i;
                    second = j;
                }
            }
        }

        System.out.println(max);
        StringBuilder sb = new StringBuilder();
        sb.append(first + 1);
        sb.append(" ");
        sb.append(second + 1);
        System.out.println(sb.toString());
    }
}
