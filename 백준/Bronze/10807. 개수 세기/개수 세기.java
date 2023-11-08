import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(nums[i]) == v){
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}