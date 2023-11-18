import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputNums = br.readLine().split(" ");
        int N = Integer.parseInt(inputNums[0]);
        int M = Integer.parseInt(inputNums[1]);
        int[] baskets = new int[N];
        
        for (int i = 0; i < N; i++) {
            baskets[i] = (i+1); 
        }
        
        
        for (int k = 0; k < M; k++) {
            String[] switchs = br.readLine().split(" ");
            int i = Integer.parseInt(switchs[0]);
            int j = Integer.parseInt(switchs[1]);
            
            int tmp = baskets[i-1];
            baskets[i-1] = baskets[j-1];
            baskets[j-1] = tmp;
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }
        
    }
}