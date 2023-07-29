import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        List<String> list = new ArrayList<>();
        String[] str = my_string.split("");
        for (int i = 0; i < str.length; i++) {
            if(Character.isUpperCase(str[i].charAt(0))) {
                list.add(str[i].toLowerCase());
            } else {
                list.add(str[i]);
            }
        }
        
        Collections.sort(list);
    
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        
        
        return answer;
    }
}