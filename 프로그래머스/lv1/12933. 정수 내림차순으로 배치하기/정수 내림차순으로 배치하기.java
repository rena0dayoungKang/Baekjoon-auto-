import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        List<String> list1 = new ArrayList<>();
        String str = String.valueOf(n);
        
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);
        }
        Collections.sort(list1, Collections.reverseOrder());
        //System.out.println(list1);
        String str2 = "";
        for (int i = 0; i < list1.size(); i++) {
            str2 += list1.get(i);
        }
        
        answer = Long.parseLong(str2);
        
        return answer;
    }
}