import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A, B;
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        
        int b0, b1, b2;
        b2 = B / 100;
        b1 = (B % 100) / 10;
        b0 = B % 10;
        
        System.out.println(A*b0);
        System.out.println(A*b1);
        System.out.println(A*b2);
        System.out.println(A*B);
        
    }
}