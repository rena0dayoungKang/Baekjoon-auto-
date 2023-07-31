class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        int tmp = 0;
        for (int i = 0; i < queries.length; i++) {            
            int index1 = queries[i][0]; //0
            int index2 = queries[i][1]; //3

            tmp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = tmp;
        }
        
        return arr;
    }
}