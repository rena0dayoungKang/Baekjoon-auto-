class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int a = common[0];
        int b = common[1];
        int c = common[2];
        
        if (b - a == c - b) { //등차
            answer = common[common.length - 1] + (b - a);
        } else { //등비
            answer = common[common.length - 1] * (b / a);
        }    
               
        return answer;
    }
}