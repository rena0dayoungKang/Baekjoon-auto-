class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String str = "";
        
        int a = my_string.length();//6
        int b = is_suffix.length();//3
        
        if (a >= b) {
            str = my_string.substring(a - b);
            if (str.equals(is_suffix)) {
                answer = 1;
            } else {
                answer = 0;
            }
        } else {
            answer = 0;
        }        
        return answer;
    }
}