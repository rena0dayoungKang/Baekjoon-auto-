class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        //1. a와 b의 최대공약수 구하기
        int gcd = gcd(a, b);
        System.out.println(gcd);
        
        //2. b를 최대공약수로 나누기 
        int numB = b / gcd; 
        
        //3. numB의 소인수가 2 또는 5 라면 유한소수   
        while (true) {
            if (numB == 1) {
                break;
            }
            if (numB % 2 == 0) {
                numB = numB / 2;
            } else if (numB % 5 == 0) {
                numB = numB / 5;
            } else {
                return 2;
            }     
        }      
        return answer;
    }
    
    public static int gcd(int a, int b) {
        int r = a % b;
        if (r == 0) {
            return b;
        } else {
            return gcd(b, r);
        }
    }
}