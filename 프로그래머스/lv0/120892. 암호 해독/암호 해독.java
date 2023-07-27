class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] str = cipher.split("");
        //System.out.println(str[4] - 1);  -> a
        
        for (int i = code; i <= str.length; i++) {
            if (i % code == 0) {
                answer += str[i - 1];
            } else {
                continue;
            }
        }
                
        return answer;
    }
}