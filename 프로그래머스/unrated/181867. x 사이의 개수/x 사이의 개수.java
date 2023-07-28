import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        
//         String[] str = myString.split("x");
//         System.out.println(Arrays.toString(str));
//         for (int i = 0; i < str.length; i++) {
//             list.add(str[i].length());
//         } 
        
//         //마지막에 x인 경우를 생각해라... 
//         if (myString.charAt(myString.length() - 1) == 'x') {
//             list.add(0);
//         }
        
        String[] arr = myString.split("");
        int tmp = 0;
        for(int i = 0; i <arr.length; i++){
            if(arr[i].equals("x")){
                list.add(tmp);
                tmp = 0;
            } else {
                tmp++;
            }
            if( i == arr.length - 1){
                list.add(tmp);
            }
        }
        
        //list.add(tmp);
        
                
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}