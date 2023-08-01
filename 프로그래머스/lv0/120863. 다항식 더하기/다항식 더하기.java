import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        List<String> list = new ArrayList<>();
        
        String[] arr = polynomial.split(" \\+ ");
        int oneX = 0;
        int constant = 0;
        //System.out.println(Arrays.toString(arr));
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("x")) {
                if (arr[i].equals("x")) {
                    oneX += 1;
                } else {
                    oneX += Integer.parseInt(arr[i].replaceAll("x", "")); 
                }
            }  else {
                constant += Integer.parseInt(arr[i]);               
            }
        }
        
        if (oneX != 0) {
            if (oneX == 1) {
                answer = "x";
            } else {
                answer = String.valueOf(oneX) + "x";
            }
        }
        
        if (constant != 0) {
            if (answer.length() != 0) {  //추가된 일차항이 있다면, (length 가 0이 아니라면)
                answer += " + ";
            } 
            answer += String.valueOf(constant);
        }
        
        return answer;
    }
}