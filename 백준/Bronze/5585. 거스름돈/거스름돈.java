import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int get = 1000 - Integer.parseInt(br.readLine());
        int[] coins = {500, 100, 50, 10, 5, 1};
        
        int index = 0;
        while (get != 0) {
            if (get >= coins[index]) {
                get -= coins[index];
                answer++;
            } else {
                index++;
            }
        }
        System.out.println(answer);
    }
}