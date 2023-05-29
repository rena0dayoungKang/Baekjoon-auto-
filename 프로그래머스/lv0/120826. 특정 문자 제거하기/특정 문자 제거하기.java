class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        if ( 1 <= my_string.length() && my_string.length() <= 100 && letter.length() == 1) {
            char[] chr = my_string.toCharArray();
            
            for(int i = 0; i < chr.length; i++) {
                if ( chr[i] == letter.charAt(0) ) {
                   continue;
                } else {
                    answer += chr[i];
                }
            }
        }
        return answer;
    }
}