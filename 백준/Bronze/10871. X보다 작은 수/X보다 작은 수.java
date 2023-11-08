import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int X = Integer.parseInt(inputs[1]);
        String[] inputNums = br.readLine().split(" ");
        
        for(String inputNum : inputNums) {
            int num = Integer.parseInt(inputNum);
            if (num < X) {
                bw.write(inputNum+ " ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
        
    }
}