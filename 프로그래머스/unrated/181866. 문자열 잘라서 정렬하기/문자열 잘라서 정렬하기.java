import java.util.*;
class Solution {
    public String[] solution(String myString) {
        
        List<String> list = new ArrayList<>();
        
        String[] str = myString.split("");        
        String tmp = "";
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("x")) {
                tmp += str[i];
            } else {
                if(tmp.equals("")){
                    continue;
                } else {
                    list.add(tmp);
                    tmp = "";
                }
            } 
        }        
        // 1. !x -- tmp에 추가
        // 2. x  -- tmp가 비었다면 pass
        //       -- tmp가 안비었다면 list에 추가, tmp를 공백으로 해준다,
        
        if (!tmp.equals("")) {
            list.add(tmp);     
        } 
        // 3. 마지막에 끝났을 떄 tmp에 문자가 있으면 list에추가
        //                    tmp가 비어있으면 pass
               
        
        Collections.sort(list);
        
        String[] answer = list.toArray(new String[0]);
        
        return answer;
    }
}