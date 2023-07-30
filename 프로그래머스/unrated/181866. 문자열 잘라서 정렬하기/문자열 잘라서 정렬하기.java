import java.util.*;
class Solution {
    public String[] solution(String myString) {
      
        List<String> list = new ArrayList<>();
        String[] strArray = myString.split("");
        String tmp = "";
        for (int i = 0; i < strArray.length; i++) {
            if (!strArray[i].equals("x")) {
                tmp += strArray[i];    
            } else {
                if (!tmp.equals("")) {
                    list.add(tmp);
                    tmp = "";
                } else {
                    continue;
                }
            }
        }
        
        if (!tmp.equals("")) {
            list.add(tmp);
        }
        
        Collections.sort(list);
        
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        
        
        return answer;
    }
}