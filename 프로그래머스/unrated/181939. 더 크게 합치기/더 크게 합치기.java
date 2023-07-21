class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String stra = "", strb = "";
        
        stra = String.valueOf(a);
        strb = String.valueOf(b);
        int ab = Integer.parseInt(stra + strb);
        int ba = Integer.parseInt(strb + stra);
        
        if (ab > ba) {
            answer = ab;
        } else {
            answer = ba;
        }
        
        return answer;
    }
}