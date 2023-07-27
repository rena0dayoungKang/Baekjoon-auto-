import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        
        Arrays.sort(num_list);
        // for (int i = 5; i < num_list.length; i++) {
        //     answer[i-5] = num_list[i];
        // }
        
        
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < num_list.length; i++) {
            queue.add(num_list[i]);
        }
        for (int i = 0; i < 5; i++) {
            queue.poll();
        }
        // System.out.println(queue);
        //	[15, 32, 38, 46, 56]
        int n = queue.size();
    
        
        for (int i = 0; i < n; i++){
            answer[i] = queue.poll();
        }
        
        return answer;
    }
}