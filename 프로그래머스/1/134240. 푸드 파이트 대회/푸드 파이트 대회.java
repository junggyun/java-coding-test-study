class Solution {
    public String solution(int[] food) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            sb1.append(String.valueOf(i).repeat(food[i] / 2));
        }
        sb2.append(sb1.toString());
        sb1.append("0");
        sb1.append(sb2.reverse());
        return sb1.toString();
    }
}