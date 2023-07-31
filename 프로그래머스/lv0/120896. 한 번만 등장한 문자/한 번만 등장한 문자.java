import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        
        for (int i = 0; i < str.length; i++) {
            int check = 0;
            if (i > 0 && str[i].equals(str[i-1])) {
                check = 1;
            }
            
            if (i < str.length - 1 && str[i].equals(str[i+1])) {
                check = 1;
            }
            
            if (check == 0) {
                answer += str[i];
            }
        }       
        return answer;
    }
}