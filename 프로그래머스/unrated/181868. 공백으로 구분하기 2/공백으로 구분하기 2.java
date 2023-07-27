import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        // List<String> result = new ArrayList<>();
        // String[] str = my_string.split(" ");
        // System.out.println(Arrays.toString(str));
        // for(int i = 0; i <str.length; i++){
        //     if(!str[i].equals("")){
        //         result.add(str[i]);
        //     }
        // }
        // System.out.println(result);
        // String[] answer = new String[result.size()];
        // for(int i = 0; i < result.size(); i++){
        //     answer[i] = result.get(i);
        // }
        String str = my_string.trim().replaceAll("\\s+", " ");
        String[] answer = str.split(" ");
        
        return answer;
    }
}