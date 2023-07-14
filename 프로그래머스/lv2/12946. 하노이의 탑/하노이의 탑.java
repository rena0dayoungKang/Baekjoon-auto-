import java.util.*;

class Solution {
    
    private static List<int[]> arr = new ArrayList<>(); 
    //이동 정보를 저장하는 ArrayList
    
    public int[][] solution(int n) {
        move(n, 1, 2, 3);
        
        int[][] answer = arr.stream().toArray(int[][]::new);
        //정수 배열을 2차원 정수 배열로 변환
        
        return answer;
    }
    
    //move 함수가 재귀적으로 호출
    private static void move(int cnt, int start, int mid, int end) {
        if(cnt == 0){
            return;
        }
        
        move(cnt - 1, start, end, mid); //출발지 -> 경유지
        arr.add(new int[]{start, end}); //이동 정보를 저장할 자료형
        move(cnt - 1, mid, start, end); //경유지 -> 도착지
        
    }
}