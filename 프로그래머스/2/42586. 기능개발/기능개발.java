import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= progresses.length; i++) {
            map.put(i, progresses[i - 1]);
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 1; i <= progresses.length; i++) {
                if (map.get(i) < 100) {
                    map.put(i, map.get(i) + speeds[i - 1]);
                    if (map.get(i) > 100) {
                        map.put(i, 100);
                    }
                }
            }
            int count = 0;
            while (!queue.isEmpty() && map.get(queue.peek()) == 100) {
                queue.poll();
                count += 1;
            }
            if (count > 0) {
                list.add(count);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}