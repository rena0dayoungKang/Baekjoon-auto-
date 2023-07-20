class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1 ; i <= n; i++) {
            int slice = i * 6;
            if (slice % n == 0) {
                answer = i;
                break;
            }           
        }
        
        return answer;
    }
}