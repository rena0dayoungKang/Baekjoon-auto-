class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String mystring = myString.toLowerCase();
        String pat2 = pat.toLowerCase();
        
        if (mystring.contains(pat2)) {
            answer = 1;
        } else {
            answer = 0;
        } 
        return answer;
    }
}