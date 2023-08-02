import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        String tmp = myStr.replaceAll("[a, b, c]", " ").trim();
        String[] arr = tmp.split("\\s+");
        if (arr[0].equals("")){arr[0] = "EMPTY";}
        
        return arr;
    }
}