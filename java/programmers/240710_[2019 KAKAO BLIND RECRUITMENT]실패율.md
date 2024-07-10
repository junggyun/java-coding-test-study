# [2019 KAKAO BLIND RECRUITMENT] 실패율 (61%)

### 소요 시간 : 1시간

```java
import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] result = new double[N][2];

        for (int i = 1; i <= N; i++) {
            double continueCount = 0;
            double reachedCount = 0;
            for (int stage : stages) {
                if (i == stage) continueCount += 1;
                if (i <= stage) reachedCount += 1;
            }
            result[i - 1][0] = i;
            if (reachedCount == 0) {
                result[i - 1][1] = 0;
                continue;
            }
            result[i - 1][1] = continueCount / reachedCount;
        }
        Arrays.sort(result, (double[] o1, double[] o2) -> {
            if (Double.compare(o2[1], o1[1]) == 0) return Double.compare(o1[0], o2[0]);
            return Double.compare(o2[1], o1[1]);
        });
        for (int i = 0; i < N; i++) {
            answer[i] = (int) result[i][0];
        }
        return answer;
    }
}
```
