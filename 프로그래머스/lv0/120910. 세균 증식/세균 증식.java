import java.lang.*;
class Solution {
    public int solution(int n, int t) {
        int answer = n * (int)Math.pow(2,t);
        // for (int i = 0; i < t; i++) {
        //     answer *= 2; 
        // }
        
        return answer;
    }
}