import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int C = Integer.parseInt(inputs[2]);
        int reward = 0;
        
        if (A == B && B == C){
            reward = 10000 + (A * 1000);
        } else if (A == B || A == C || B == C){
            int sameNum = A == B ? A : C;
            reward = 1000 + (sameNum * 100);
        } else {
            int maxNum = Math.max(A, Math.max(B,C));
            reward = maxNum * 100;
        } 
        
        System.out.println(reward);
    }
}