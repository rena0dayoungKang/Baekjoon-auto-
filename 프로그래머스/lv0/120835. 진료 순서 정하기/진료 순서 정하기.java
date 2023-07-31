import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < emergency.length; i++) {
           list.add(emergency[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        
        // 100 30 23 10 6
        
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = list.indexOf(emergency[i]) + 1;
        }
        
        return answer;
    }
}