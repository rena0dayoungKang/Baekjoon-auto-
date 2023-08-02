class Solution {
    public int solution(int n) {
            
        //1. 3의 배수, 숫자 3을 사용하지 않는 조건 만들기 
        for(int i = 1; i <= n; i++) {
           if (i % 3 == 0) {
               n++;
           } else if (String.valueOf(i).contains("3")) {
               n++;
           }
        }    
        int answer = n;
            
        //2. n을 마을의 숫자로 바꿔서 return  
        return answer;
    }
}