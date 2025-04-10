class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x", -1);
        System.out.println(arr.length);
        int[] answer = new int[arr.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i].length();
        }
        return answer;
    }
}