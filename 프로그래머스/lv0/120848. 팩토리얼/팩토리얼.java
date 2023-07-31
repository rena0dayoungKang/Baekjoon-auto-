class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int i = 1; 
        int factor = 1;
        
        while (factor <= n) {
            i++;
            factor *= i;
        }
        
        return i - 1;
    }
}