import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String nStr = Integer.toString(n);
        String[] arr = nStr.split("");
        //System.out.println(Arrays.toString(arr));
        
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        
        
        
//         List<String> list = new ArrayList<>();
        
//         for (int i = 0; i < list.size(); i++) {
//             list.add(nStr.charAt(i));
//             answer += list.get(i);            
//         }
        
        return answer;
    }
}