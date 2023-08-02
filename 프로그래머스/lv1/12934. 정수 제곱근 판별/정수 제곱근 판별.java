import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double nn = Math.sqrt(n);
        if (nn - (long)nn != 0) {
            answer = -1;
        } else {
            long tmp = (long)nn;
            answer = (tmp + 1) * (tmp + 1);
        }
        
        return answer;
    }
}