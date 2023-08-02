class Solution {
    public int[] solution(long n) {
        
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[arr.length - i - 1]);
        }
        
        return answer;
    }
}