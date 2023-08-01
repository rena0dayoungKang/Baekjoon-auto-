import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        //1. participant 매핑
        HashMap<String, Integer> map1 = new HashMap<>();
        for (String part : participant) {
            map1.put(part, map1.getOrDefault(part, 0) + 1);    
        }       
        
        //2. completion 매핑
        for (String comp : completion) {
            map1.put(comp, map1.getOrDefault(comp, 0) - 1);
        }

        //3. 완주하지 못한 (value != 0) 선수 (key) 찾기 
        for (String key : map1.keySet()){
            if (map1.get(key) != 0) {
                answer = key;
                break;
            } 
        }
        
        
        return answer;
    }
}