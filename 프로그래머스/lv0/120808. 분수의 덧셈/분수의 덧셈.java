class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int denom = denom2 * denom1;
        int numer = (numer1 * denom2) + (numer2 * denom1);
        
        int gcf = 1;
        for (int i = 1; i <= numer && i <= denom; i++){
            if (denom % i == 0 && numer % i == 0){
                gcf = i;
            }
        }
        
        numer = numer / gcf;
        denom = denom / gcf;
        int[] answer = {numer, denom};
        
        return answer;
    }
}