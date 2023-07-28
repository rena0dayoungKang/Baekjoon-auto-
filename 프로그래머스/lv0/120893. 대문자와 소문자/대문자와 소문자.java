class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                answer += (arr[i]+"").toLowerCase();
            } else {
                answer += (arr[i]+"").toUpperCase();
            }
        }
        
        
        return answer;
    }
}