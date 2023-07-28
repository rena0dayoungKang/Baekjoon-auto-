import java.util.*;
class Solution {
    public int[] solution(String my_string) {        
        
        List<Integer> list = new ArrayList<>();
        char[] arr = my_string.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                list.add(Integer.parseInt(arr[i]+""));
            } else {
                continue;
            }
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }      
        return answer;
    }
}