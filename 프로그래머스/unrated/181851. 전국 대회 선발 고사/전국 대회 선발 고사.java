import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;    
        
        //1. 참석 true 인 사람(랭크)을 구분하기 
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < attendance.length; i++) {
            list2.add(rank[i]);
            if (attendance[i]){
                list1.add(rank[i]);
            } else {
                continue;
            }
        }
        System.out.println(list1);
        
        //2. 참석하는 사람들의 rank 오름차순 정렬
        Collections.sort(list1);
        System.out.println(list1);
        
        //3. 오름차순 3순위까지 rank 에서의 번호에 따라 계산
        //배열을 이중for 
        //list.indexOf
        
        // for (int i = 0; i < 3; i++) {
        //     int tmp = list1.get(i);
        //     for(int j = 0; j < rank.length; j++){
        //         if(tmp == rank[j]){
        //             // if(i == 0){
        //             //     answer += j * 10000;
        //             // } else if(i == 1) {
        //             //     answer += j * 100;
        //             // } else if(i == 2){
        //             //     answer += j
        //             // }
        //             list2.add(j);
        //         }
        //     }
        // }
        // answer = list2.get(0) * 10000 + list2.get(1) * 100 + list2.get(2);
        
        answer = list2.indexOf(list1.get(0)) * 10000 + list2.indexOf(list1.get(1)) * 100 + list2.indexOf(list1.get(2));
        
        return answer;
    }
}