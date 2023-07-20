import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String intStr = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)){
                answer += Integer.parseInt(String.valueOf(ch));
            }
        }        
        return answer;
    }
}