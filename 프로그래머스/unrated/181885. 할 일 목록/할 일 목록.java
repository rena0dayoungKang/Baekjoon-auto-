import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        List<String> strList = new ArrayList<>();
        
        if ( 1<= todo_list.length && todo_list.length <= 100) {
            for (int i = 0; i < todo_list.length; i++){
                if (finished[i] == false) {
                    strList.add(todo_list[i]);
                }
            }
            
        }      
        
        return strList.toArray(new String[0]);
    }
}