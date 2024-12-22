class Solution {
    public int solution(int[] sides) {
        int max = sides[0];
        int min1 = sides[0];
        int min2 = sides[0];
        for (int side : sides) {
            if (side < min1) {
                min2 = min1;
                min1 = side;
            }
            if (side > max) {
                max = side;
            }
        }
        return min1 + min2 > max ? 1 : 2;
    }
}