class Solution {
    public Long solution(int balls, int share) {
        Long answer = 1L;
        if (balls == share) {
            return 1L;
        }
        
        int min = Math.min(share, balls-share);
        for (int i = 0; i < min; i++) {
            answer = answer * balls;
            balls--;
            answer = answer / (i + 1); 
        }
        
        return answer;
    }
}