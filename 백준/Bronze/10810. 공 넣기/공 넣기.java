import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inputTypes = br.readLine().split(" ");
        int N = Integer.parseInt(inputTypes[0]);
        int M = Integer.parseInt(inputTypes[1]);
        int[] baskets = new int[N];
        
        for (int i = 0; i < M; i++) {
            String[] inputNums = br.readLine().split(" ");
            int I = Integer.parseInt(inputNums[0]);
            int J = Integer.parseInt(inputNums[1]);
            int K = Integer.parseInt(inputNums[2]);
            
            for (int j = I-1; j < J; j++) {
                baskets[j] = K;
            }.  
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}