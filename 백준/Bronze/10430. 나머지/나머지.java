import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        
        int A, B, C; 
        A = Integer.parseInt(inputs[0]);
        B = Integer.parseInt(inputs[1]);
        C = Integer.parseInt(inputs[2]);
        
        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);      
    }
}