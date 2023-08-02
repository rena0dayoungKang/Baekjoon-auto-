
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        int[] avg = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2; 
        }
        
        
        for (int i = 0; i < avg.length; i++) {
            answer[i] = 1;
            for (int j = 0; j < avg.length; j++) {
                if (avg[i] < avg[j]) {
                    answer[i]++;
                }
            }
        }
        
        
        return answer;
    }
}