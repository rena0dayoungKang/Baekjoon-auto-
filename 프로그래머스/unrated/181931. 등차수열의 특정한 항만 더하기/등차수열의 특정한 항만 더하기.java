class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int[] arr = new int[included.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a + (d * i);
            // System.out.println(arr[i]);
            if (included[i]){
                answer += arr[i];
            } else {
                continue;
            }
        }
        
        return answer;
    }
}