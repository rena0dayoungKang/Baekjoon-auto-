import java.util.*;
class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        //System.out.println(Arrays.toString(numLog));
        //List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < numLog.length - 1; i++) {
            int tmp = numLog[i+1] - numLog[i];
            if (tmp == 1) {
                answer += "w";
            } else if (tmp == -1) {
                answer += "s";
            } else if (tmp == 10) {
                answer += "d";
            } else if (tmp == -10) {
                answer += "a";
            }
        }
        
        return answer;
    }
}