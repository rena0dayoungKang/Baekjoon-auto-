import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        String[] arr = my_string.split("");
        //System.out.print(Arrays.toString(str));
        
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i].repeat(n);
        }
        
        
        return answer;
    }
}