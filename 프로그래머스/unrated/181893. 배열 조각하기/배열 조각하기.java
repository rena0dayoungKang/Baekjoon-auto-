import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < arr.length; i++) {
            list.add(arr[i]);
        }
        
        
        for (int i = 0; i < query.length; i++) {
            if (query[i] % 2 == 0) {
                list.remove(arr[query[i] + 1]);    
            } else if (query[i] % 2 == 1) {
                continue;
            }
        }
        
        System.out.println(list);       
        return answer;
    }
}