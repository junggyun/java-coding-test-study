class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        /*
        - n번만큼 for문을 돌린다.
        Math.sqrt(2, n)에서 arr1[i], arr2[i]보다 작거나 같을 때 까지 n에서 1을 뺀다.
        arr1,2[i] - Math.sqrt(2, n) 값이 0 이 아니라면 이어서 계속 뺀다.
        클 때는 " " 작거나 같으면 "#"을 넣으며 sb1, sb2를 완성한다.
            - n번만큼 for문을 돌린다.
            str1과 str2의 자리수의 문자를 비교하며 answer을 만들고 출력한다.
        */
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int remain1 = arr1[i];
            int remain2 = arr2[i];
            for (int j = n - 1; j >= 0; j--) {
                if (Math.pow(2, j) <= remain1 || Math.pow(2,j) <= remain2) {
                    sb.append("#");
                    if (Math.pow(2, j) <= remain1) {
                        remain1 -= Math.pow(2, j);
                    }
                    if (Math.pow(2, j) <= remain2) {
                        remain2 -= Math.pow(2, j);
                    }
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
            sb.setLength(0);
        }
        return answer;
    }
}