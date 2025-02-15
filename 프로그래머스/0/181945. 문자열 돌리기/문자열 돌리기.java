import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for (int i = 0; i < a.length(); i++) {
            answer += String.valueOf(a.charAt(i));
            if (i < a.length() - 1) answer += "\n";
        }
        System.out.println(answer);
    }
}