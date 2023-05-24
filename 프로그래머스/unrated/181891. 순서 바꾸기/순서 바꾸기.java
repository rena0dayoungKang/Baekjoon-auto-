import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        List<Integer> arr1 = new ArrayList<Integer>();
        List<Integer> arr2 = new ArrayList<Integer>();
        
        //arraylist에 add
        for ( int i = 0 ; i < num_list.length; i++) {
            if ( i < n ){
                arr1.add(num_list[i]);
            } else if ( i >= n ) {
                arr2.add(num_list[i]);
            }
        }
        
        //arraylist를 합치기 
        arr2.addAll(arr1);
        
        //arraylist를 answer 배열로 바꾸기 
        answer = arr2.stream().mapToInt(i -> i).toArray();
        
        //배열을 출력하기
        //System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}