class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] arr = myString.toCharArray();
        //System.out.println(Arrays.toString(arr));
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                answer += Character.toUpperCase(arr[i]);
            } else if (arr[i] != 'A' && Character.isUpperCase(arr[i])) {
                answer += Character.toLowerCase(arr[i]);
            } else {
                answer += arr[i];
            }
        }        
        return answer;
    }
}