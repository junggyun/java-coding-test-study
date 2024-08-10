import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            Stack<String> stack = new Stack<>();
            for (int j = 0; j < str.length(); j++) {
                if (String.valueOf(str.charAt(j)).equals("(")) {
                    stack.push(String.valueOf(str.charAt(j)));
                } else {
                    if (stack.isEmpty()) {
                        stack.push("");
                        break;
                    }
                    stack.pop();
                }
            }
            System.out.println(stack.isEmpty() ? "YES" : "NO");
        }
    }
}
