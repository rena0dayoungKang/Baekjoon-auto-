import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < beforeArr.length; i++) {
            str1 += beforeArr[i];
            str2 += afterArr[i];
        }
        
        if (str1.equals(str2)) {
            answer = 1; 
        }
        
        return answer;
    }
}