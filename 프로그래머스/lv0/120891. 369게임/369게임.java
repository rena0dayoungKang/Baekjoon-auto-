import java.util.*;
class Solution {
    public int solution(int order) {
        int clap = 0;
        
        String[] str = String.valueOf(order).split("");
        // System.out.println(Arrays.toString(str));
        for (int i = 0; i < str.length; i++) {
            if (Integer.parseInt(str[i]) % 3 == 0 && !str[i].equals("0")) {
                clap++;
            } else {
                continue;
            }
        }
        
        
        return clap;
    }
}