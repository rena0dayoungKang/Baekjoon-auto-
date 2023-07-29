import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while (n != 1) {
            n = calculate(n);
            list.add(n);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    
    public int calculate(int n) {     
        if (n % 2 == 0) {
            n = n / 2; 
        } else {
            n = 3 * n + 1; 
        }        
        return n;
    }
}