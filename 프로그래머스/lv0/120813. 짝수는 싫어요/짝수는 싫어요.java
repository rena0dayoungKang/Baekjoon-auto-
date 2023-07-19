import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                list.add(i);
            }
        }
        
        //1. int[] answer = list.stream().mapToInt(i->i).toArray();
        //2. String[] arr = list.toArray(new String[0]);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

//몇개 인지 모르는 배열은 무조건 list..

