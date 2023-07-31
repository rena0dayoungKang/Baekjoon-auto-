import java.lang.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        //최솟값, 최댓값 찾기. 값과 인덱스 선언
        int min = Integer.MAX_VALUE;
        int min_idx = 0;
        for (int i = 0; i < array.length; i++) {
            if(min > Math.abs(array[i] - n)){
                min = Math.abs(array[i] - n);
                min_idx = i;
            } else if(min == Math.abs(array[i] -n)){
                if (array[i] < array[min_idx]) {
                    min_idx = i;
                }
            }       
        }
        answer = array[min_idx];
        
        
        return answer;
    }
}