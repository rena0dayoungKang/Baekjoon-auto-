class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        if (x >= -10000000 && x <= 10000000 && n <= 1000) {
            for (int i = 0; i < n; i++) {
                answer[i] = x + (x * (long)i);
            }            
        } 
        
        return answer;
    }
}