import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        // skip 문자들을 Set에 저장하여 빠르게 포함 여부를 확인
        Set<Character> skipSet = new HashSet<>();
        for (char ch : skip.toCharArray()) {
            skipSet.add(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        
        // 문자열 s의 각 문자에 대해 처리
        for (char ch : s.toCharArray()) {
            int count = 0; // index만큼 이동하기 위한 카운트
            
            // index만큼 이동할 때마다 skip에 있는 문자는 건너뜀
            while (count < index) {
                ch++; // 알파벳을 한 칸씩 이동
                if (ch > 'z') {
                    ch = 'a'; // z를 넘어가면 a로 돌아감
                }
                
                // skip 문자에 없으면 count 증가
                if (!skipSet.contains(ch)) {
                    count++;
                }
            }
            
            sb.append(ch); // 변환된 문자 추가
        }
        
        return sb.toString();
    }
}
