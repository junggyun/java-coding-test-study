class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int deletedCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    arr[i] = 0;
                    deletedCount++;
                    break;
                }
            }
        }
        int[] answer = new int[arr.length - deletedCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}