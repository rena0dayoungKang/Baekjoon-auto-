class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        if ( 1 <= a && a < 10000 && 1<= b && b < 10000) {
            
            String stra = Integer.toString(a);
            String strb = Integer.toString(b);
            String str = stra + strb;
            int intStr = Integer.parseInt(str);
            int calc = 2 * a * b;
            
            if (intStr > calc) {
                answer = intStr;
            } else if (intStr < calc) {
                answer = calc;
            } else {
                answer = intStr;
            }
            
        }   
        
        return answer;
    }
}