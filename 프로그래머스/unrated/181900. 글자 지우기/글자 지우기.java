import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        List<String> list = new ArrayList<>();
        String[] str = my_string.split("");
        
        for (int i = 0; i < indices.length; i++) {
            str[indices[i]] = "";
        }
        
        // System.out.println(Arrays.toString(str));
        
        for (int i = 0; i < str.length; i++) {
            answer += str[i];
        }
        
        return answer;
    }
}