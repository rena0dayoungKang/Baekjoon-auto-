class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        
        for(int i = 0; i < str1.length(); i++) {
            answer += String.valueOf(ch1[i]) + String.valueOf(ch2[i]);
        }
        
        return answer;
    }
}