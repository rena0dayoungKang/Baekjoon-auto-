import java.util.*;
class Solution {
    public long solution(int balls, int share) {
        long answer = 1L;
        
        if (balls == share) {
            answer = 1L;
        }
            
        int min = Math.min(share, balls-share);
        for (int i = 1; i <= min; i++) {
            answer = answer * balls;
            balls--;
            answer = answer / i;
        }
        
        return answer;
    }
}