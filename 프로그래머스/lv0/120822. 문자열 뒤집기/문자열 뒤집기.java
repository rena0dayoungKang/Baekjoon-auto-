import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] arr = my_string.split("");
        String[] strArr = new String[my_string.length()];
        // System.out.println(Arrays.toString(arr));
        
        for (int i = 0; i < arr.length; i++) {
            answer += arr[arr.length - i - 1];
        }
        
        
        
        return answer;
    }
}