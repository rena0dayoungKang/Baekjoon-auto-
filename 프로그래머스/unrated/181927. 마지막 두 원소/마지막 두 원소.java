import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            list.add(num_list[i]);
        }
        
        int a = list.get(list.size() - 1);
        int b = list.get(list.size() - 2);
        
        if (a > b) {
            list.add(a - b);
        } else {
            list.add(a * 2);
        }
               
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}