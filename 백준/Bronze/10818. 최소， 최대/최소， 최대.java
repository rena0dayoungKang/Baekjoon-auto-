import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] inputNums = br.readLine().split(" ");
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String inputNum : inputNums) {
            int num = Integer.parseInt(inputNum);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        System.out.print(min + " " + max);
        
    }
}