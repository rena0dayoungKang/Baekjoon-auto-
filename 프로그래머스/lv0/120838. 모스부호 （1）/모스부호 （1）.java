class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                          "--.","....","..",".---","-.-",".-..",
                          "--","-.","---",".--.","--.-",".-.",
                          "...","-","..-","...-",".--","-..-",
                          "-.--","--.."};
        
        String[] parts = letter.split(" ");
        for (String part : parts) {
            for (int i = 0; i < morse.length; i++) {
                if (part.equals(morse[i])) {
                    answer += (char)(i + 97);
                    break;
                }
            }
        }
        
        
        
        return answer;
    }
}