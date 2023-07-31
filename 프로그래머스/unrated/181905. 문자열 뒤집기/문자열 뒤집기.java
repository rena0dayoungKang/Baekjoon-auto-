class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String[] str = my_string.split("");
        for (int i = 0; i < s; i++) {
            answer += str[i]; 
        }
        String tmp = "";
        for (int i = s; i <= e; i++) {
            tmp = str[i] + tmp;
        }
        answer += tmp;
        
        for (int i = (e+1); i < str.length; i++) {
            answer += str[i];
        }
        
        return answer;
    }
}