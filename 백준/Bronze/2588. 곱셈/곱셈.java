import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();
        
        int b0, b1, b2;
        //b2 = B / 100;
        //b1 = (B % 100) / 10;
        //b0 = B % 10;
        b2 = Character.getNumericValue(B.charAt(0));
        b1 = Character.getNumericValue(B.charAt(1));
        b0 = Character.getNumericValue(B.charAt(2));
        
        int b = Integer.parseInt(B);
        
        System.out.println(A*b0);
        System.out.println(A*b1);
        System.out.println(A*b2);
        System.out.println(A*b);
        
    }
}