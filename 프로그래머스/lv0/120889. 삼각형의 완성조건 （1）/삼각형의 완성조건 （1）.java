import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        int a = sides[sides.length -1]; //마지막 값 꺼내오기 
        if ( a < sides[0] + sides[1]) {
            answer = 1;
        } else {
            answer = 2;
        }
        
            
        return answer;
    }
}