class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        
        // int i = start;
        // int k = 0;
        // while(true){
        //     answer[k]= i;
        //     i = 3*i;
        //     k++;
        //     if(k > answer.length -1) break;
        // }
        
        int k = 0;
        for (int i = start; i <= end; i++) {
            answer[k] = i;
            k++;
        }        
        
        return answer;
    }
}