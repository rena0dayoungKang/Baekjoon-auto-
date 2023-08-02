import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        
        //1. slicer 원소 
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        //2. list에 넣기
        List<Integer> list1 = new ArrayList<>();
        if (n == 1) {
           for (int i = 0; i <= b; i++) {
               list1.add(num_list[i]);
           } 
        } else if (n == 2) {
            for (int i = a; i <= num_list.length - 1; i++) {
                list1.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = a; i <= b; i++) {
                list1.add(num_list[i]);
            }
        } else {
            for (int i = a; i <= b; i += c) {
                list1.add(num_list[i]);
            }
        }
        System.out.println(list1);
        
        //3. answer 배열에 넣기 
        int[] answer = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            answer[i] = list1.get(i);
        }
        
        return answer;
    }
}