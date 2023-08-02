import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        //1. s를 공백으로 자른다.
        String[] arr = s.split(" ");        
        System.out.println(Arrays.toString(arr));
        
        //2. 배열을 돌면서 더한다. z가 나오면 그 전 숫자를 뺀다.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) { 
                answer -= Integer.parseInt(arr[i-1]); //z로 시작하지 않으니까 오류안남
            } else {
                answer += Integer.parseInt(arr[i]);    
            }
        }
        
        
        return answer;
    }
}