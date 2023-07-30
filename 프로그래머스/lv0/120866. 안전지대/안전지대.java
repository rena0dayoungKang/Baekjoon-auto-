import java.util.*;

class Solution {
    public int solution(int[][] board) {
        List<String> al = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 1){
                    String idx = "" + i + "," + j;
                    al.add(idx);
                }
            }
        }
        for(String s : al){
            String[] i_j = s.split(",");
            int i = Integer.parseInt(i_j[0]);
            int j = Integer.parseInt(i_j[1]);
            try{
                board[i-1][j-1] = 2;
            } catch(Exception e){
            }
            try{
                board[i-1][j] = 2;
            } catch(Exception e){
            }
            try{
                board[i-1][j+1] = 2;
            } catch(Exception e){
            }
            try{
                board[i][j-1] = 2;
            } catch(Exception e){
            }
            try{
                board[i][j+1] = 2;
            } catch(Exception e){
            }
            try{
                board[i+1][j-1] = 2;
            } catch(Exception e){
            }
            try{
                board[i+1][j] = 2;
            } catch(Exception e){
            }
            try{
                board[i+1][j+1] = 2;
            } catch(Exception e){
            }
        }
        
        int answer = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}