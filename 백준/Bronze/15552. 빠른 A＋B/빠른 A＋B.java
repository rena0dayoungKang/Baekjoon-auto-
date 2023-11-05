import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for (int i = 0; i < T; i++) {
            String[] inputs = br.readLine().split(" ");
            int A = Integer.parseInt(inputs[0]);
            int B = Integer.parseInt(inputs[1]);
            sum = A + B;
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}