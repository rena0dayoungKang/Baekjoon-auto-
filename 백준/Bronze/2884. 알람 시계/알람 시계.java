import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        
        int H = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        
        if (M >= 45) {
            M -= 45;
        } else {
            H = (H + 23) % 24;
            M = 60 + M - 45;
        }
        
        System.out.println(H + " " + M);
    }
}