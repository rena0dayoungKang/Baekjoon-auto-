class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            int count = 0; 
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                } else {
                    continue;
                }
            }
            
            if (count > 2) {
                answer++; 
            } else {
                continue;
            }            
            
        }        
        return answer;
    }
}