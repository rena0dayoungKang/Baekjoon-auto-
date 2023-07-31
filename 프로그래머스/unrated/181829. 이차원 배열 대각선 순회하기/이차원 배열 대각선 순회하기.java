import java.util.*;

class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
               if(i + j <= k) {
                   answer += board[i][j];
                   intList.add(board[i][j]);
               }       
            }

        }
        System.out.println(intList);
        
        return answer;
    }
}