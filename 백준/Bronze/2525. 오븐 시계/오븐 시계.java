import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        String cook = br.readLine();
        
        int A, B, C;
        A = Integer.parseInt(inputs[0]);
        B = Integer.parseInt(inputs[1]);
        C = Integer.parseInt(cook);
        
        if (B + C >= 60) {
            A = (A + ((B + C) / 60)) % 24;
            B = (B + C) % 60;            
        } else {
            B = B + C;
        }
        
        System.out.println(A + " " + B);
    }
}