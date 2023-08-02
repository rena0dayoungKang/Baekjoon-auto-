import java.util.*;

public class Solution {
    public int[] solution(int []arr) {        
        //1. arr의 숫자를 하나씩 stack 
        //2. 현재 인덱스 앞의 숫자가 현재 숫자와 같다면 넣지 않음
        //3. 중복되는 수를 제거하고 남은 수를 출력
        
        Stack<Integer> stack1 = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack1.isEmpty()){
                stack1.push(arr[i]);
            }
            
            if (stack1.peek() != arr[i]) {
                stack1.push(arr[i]);
            }
        }
        
        int[] answer = new int[stack1.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[answer.length - 1 - i] = stack1.pop();
        }
        

        return answer;
    }
}