import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x, y;
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());
        
        String quadrant;
        
        if (x > 0 && y > 0) {
            quadrant = "1";
        } else if (x < 0 && y > 0) {
            quadrant = "2";
        } else if (x < 0 && y < 0) {
            quadrant = "3";
        } else {
            quadrant = "4";
        } 
        
        System.out.println(quadrant);
        
    }
}