class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] arr = myString.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 'a' && arr[i] < 'l') {
                answer += 'l';
            } else {
                answer += arr[i];
            }
        }        
        return answer;
    }
}