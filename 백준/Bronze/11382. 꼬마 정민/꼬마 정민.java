import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        
        long A, B, C;
        A = Long.parseLong(inputs[0]);
        B = Long.parseLong(inputs[1]);
        C = Long.parseLong(inputs[2]);
        
        System.out.println(A+B+C);
    }
}