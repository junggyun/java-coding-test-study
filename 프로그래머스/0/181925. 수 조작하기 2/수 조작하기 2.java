class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int change = 0;
        for (int i = 0; i < numLog.length - 1; i++ ) {
            change = numLog[i + 1] - numLog[i];
            switch (change) {
                case 1:
                    sb.append("w");
                    break;
                case -1:
                    sb.append("s");
                    break;
                case 10:
                    sb.append("d");
                    break;
                case -10:
                    sb.append("a");
                    break;
            }
        }
        return sb.toString();
    }
}