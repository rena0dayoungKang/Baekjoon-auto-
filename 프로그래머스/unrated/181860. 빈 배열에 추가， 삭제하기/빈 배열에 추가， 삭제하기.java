import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
//         int[] answer = {};
//         List<Integer> list = new ArrayList<Integer>();
        
//         for (int i = 0; i < flag.length; i++) {
//             if (flag[i] == true) {
//                 for (int j = 0; j < arr[i] * 2; j++){
//                     list.add(arr[i]);
//                 }
//                 System.out.println(list);
//             } else {
//                 for (int k= 0; k < arr[i]; k++){
//                     list.remove(list.size() - 1);
//                     System.out.println(list);
//                 }
//             }
//         }
        
//         answer = list.stream().mapToInt(i -> i).toArray();
        Stack<Integer> stack1 = new Stack<>();
        for(int i = 0; i < flag.length; i++){
            if(flag[i]){
                for(int j = 0; j < arr[i]; j++){
                    stack1.push(arr[i]);
                    stack1.push(arr[i]);
                }
            } else {
                for(int j = 0; j < arr[i]; j++){
                    stack1.pop();
                }
            }
        }
        int[] answer = new int[stack1.size()];
        for(int i = 0; i < answer.length; i++){
            answer[answer.length - 1 - i] = stack1.pop();
        }        
        
        return answer;
        
        
    }
}