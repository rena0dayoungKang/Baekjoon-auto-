import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        //answer = 1 이 될 때 조건을 미리 잡아줘라
        if (num_list.length <= 10) {
            answer = 1;
        }
        
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list.length <= 10) {
                answer = num_list[i] * answer;
            } else if (num_list.length >= 11) {
                answer += num_list[i];
            } 
        }        
        
        return answer;
    }
}