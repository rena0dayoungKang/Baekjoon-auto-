import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[][] arr = new String[my_string.length() / m][m];
        
        
        String[] str = my_string.split("");
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = str[idx];
                idx++;
            }
        }
        
        for (int j = 0; j < arr.length; j++) {
            answer += arr[j][c - 1];
        } 
        
        
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        
        
        
        return answer;
    }
}