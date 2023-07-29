import java.lang.*;
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        int aa = (int)Math.pow(a, 2);
        int bb = (int)Math.pow(b, 2);
        int cc = (int)Math.pow(c, 2);
        
        int aaa = (int)Math.pow(a, 3);
        int bbb = (int)Math.pow(b, 3);
        int ccc = (int)Math.pow(c, 3);
        
        if (a != b && b != c && c != a) {
            answer = a + b + c;
        } else if (a == b && b == c && c == a){
            answer = (a + b + c) * (aa + bb + cc) * (aaa + bbb + ccc);
        } else {
            answer = (a + b + c) * (aa + bb + cc);
        }
        
        return answer;
    }
}