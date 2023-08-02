import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        //1. answer배열의 길이를 구하기 tmp
        int tmp = 1;
        while (true) {
            
            if (tmp >= arr.length) {
                break;
            }
            tmp = tmp * 2;
        }
        int[] answer = new int[tmp];
        
        /*
        Arrays.fill(answer, -100);
        System.out.println(Arrays.toString(answer));
        int[][] asd = new int[10][10];
        for(int i = 0; i < asd.length; i++){
            Arrays.fill(asd[i], 7);
        }
        for(int i = 0; i < asd.length; i++){
            for(int j = 0 ; j < asd[i].length; j++){
                System.out.print(asd[i][j] + "  ");
            }
            System.out.println();
        }
        */
        
        //2. answer 배열에 arr 원소 넣기 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer[i] = arr[i];
            } else {
                continue;
            }
        }
        
        return answer;
    }
}