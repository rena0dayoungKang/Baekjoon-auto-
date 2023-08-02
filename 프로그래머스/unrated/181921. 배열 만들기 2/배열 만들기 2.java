import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        
        //1. 리스트만들기
        List<Integer> list1 = new ArrayList<>();
                
        //2. 5와 0으로 이루어진 수를 리스트에 넣기
        for (int i = l; i <= r; i++) {
            String a = String.valueOf(i);
            if (!a.contains("1") && !a.contains("2") && !a.contains("3") &&
                !a.contains("4") && !a.contains("6") && !a.contains("7") &&
                !a.contains("8") && !a.contains("9")) {
                list1.add(i);
            }
        }  
        
        //3. 배열으로 출력 (없으면 -1)
        int[] answer = {-1};
        if (list1.size() != 0) {
            answer = new int[list1.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list1.get(i);
            }
        }
        
        return answer;
    }
}