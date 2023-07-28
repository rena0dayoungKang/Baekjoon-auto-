import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        
        // Arrays.sort(array);
        // answer[0] = array[array.length - 1];
        // answer[1] = array.length - 2;
        int max = Integer.MIN_VALUE;
        int max_idx = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                max_idx = i;
            }
        }
        answer[0] = max;
        answer[1] = max_idx;
        
        return answer;
    }
}