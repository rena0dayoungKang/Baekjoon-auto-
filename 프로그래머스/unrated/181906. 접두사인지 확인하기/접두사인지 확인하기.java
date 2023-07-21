import java.util.*;
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String str = "";
        
        int a = my_string.length(); 
        int b = is_prefix.length(); 
        
        if (a > b) {
            str = my_string.substring(0, b);
            if (str.equals(is_prefix)) {
                answer = 1;
            } else {
                answer = 0;
            }   
        } else {
            answer = 0;
        }
        
         return answer;
    }
}