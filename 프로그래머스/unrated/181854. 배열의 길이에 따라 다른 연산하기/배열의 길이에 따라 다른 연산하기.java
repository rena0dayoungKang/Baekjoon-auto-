class Solution {
    public int[] solution(int[] arr, int n) {
        int a = arr.length;
        int[] answer = new int[a];
        
        for (int i = 0; i < arr.length; i++) {
            if (a % 2 == 0 && i % 2 == 1){
                answer[i] = arr[i] + n;
            } else if (a % 2 == 1 && i % 2 == 0) {
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }
        
        // if (a % 2 == 1) {
        //     for (int i = 0; i < a; i++) {
        //         if (i % 2 == 0) {
        //             answer[i] = arr[i] + n;
        //         } else {
        //             answer[i] = arr[i];
        //         }
        //     }
        // } else {
        //     for (int i = 0; i < a; i++) {
        //         if (i % 2 == 1) {
        //             answer[i] = arr[i] + n;
        //         } else {
        //             answer[i] = arr[i];
        //         }
        //     }
        // }
        
        return answer;
    }
}