class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int calc = 2 * a * b;    
        int xor = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        
        return Math.max(xor, calc);
    }
}