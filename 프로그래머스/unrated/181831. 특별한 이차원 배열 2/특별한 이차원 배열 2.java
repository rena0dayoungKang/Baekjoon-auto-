class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        
        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == arr[j][i]) {
                    answer = 1;
                } else {
                    answer = 0;
                    check = 1;
                    break;
                }
            }
        }
        //한번이라도 잘못 되었으면 체크 
        if(check == 1) {
            answer = 0;
        }        
        return answer;
    }
}