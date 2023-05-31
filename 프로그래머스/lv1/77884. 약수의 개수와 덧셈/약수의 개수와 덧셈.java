class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        
        if(1 <= left && left <= right && right <= 1000) {
            for(int i = left; i < right + 1; i++){
                count = 0;
                for(int j = 1; j < (i+1); j++){
                    if(i % j == 0){
                        count++;
                    } else {
                        continue;
                    }
                }
                if(count % 2 == 0) {
                    answer += i;
                } else if (count % 2 == 1) {
                    answer -= i;
                }
            }
        }
        return answer;
    }
}