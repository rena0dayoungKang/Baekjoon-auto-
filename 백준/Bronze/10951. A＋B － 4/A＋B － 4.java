import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
            String inputLine = br.readLine();
            if (inputLine == null) {
                break;
            }
            
            String[] inputs = inputLine.split(" ");
            int A = Integer.parseInt(inputs[0]);
            int B = Integer.parseInt(inputs[1]);
            int sum = A + B;
            
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}