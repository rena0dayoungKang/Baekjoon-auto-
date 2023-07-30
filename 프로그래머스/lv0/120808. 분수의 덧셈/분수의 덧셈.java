class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int denom = denom1 * denom2;
        int numer = (numer1 * denom2) + (numer2 * denom1);
        
        int tmp = GCD(denom, numer);
        
        answer[0] = numer / tmp;
        answer[1] = denom / tmp;
        
        return answer;
    }
    
    public static int GCD (int a, int b) {
        int r = a % b;
        if (r == 0) {
            return b;
        } else {
            return GCD(b, r);
        }
    
    }
}