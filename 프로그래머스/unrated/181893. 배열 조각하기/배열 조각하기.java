import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }
        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                int n = arrList.size();
                for (int j = 0; j < n - (query[i] + 1); j++){
                    arrList.remove(arrList.size() - 1);
                    //System.out.println(arrList);
                }
            } else {
                for (int j = 0; j < query[i]; j++) {
                    arrList.remove(0);
                    //System.out.println(arrList);
                }
            }
        }
        
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        
             
        return answer;
    }
}