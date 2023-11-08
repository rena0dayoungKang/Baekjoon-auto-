import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int X = Integer.parseInt(inputs[1]);
        String[] inputNums = br.readLine().split(" ");
        
        for(int i = 0; i < N; i++) {
            if ((Integer.parseInt(inputNums[i])) < X) {
                bw.write(inputNums[i] + " ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
        
    }
}