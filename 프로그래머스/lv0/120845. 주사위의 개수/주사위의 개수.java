class Solution {
    public int solution(int[] box, int n) {
        //int answer = 0 이면 항상 곱하기가 0이되니까!!
        int answer = 1;
        
        for (int i = 0; i < box.length; i++) {
            answer *= (box[i] / n);
        }
        
        return answer;
    }
}