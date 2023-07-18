import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int sum = 0, max = 0;
        double newAvg = 0.0;
        
        if (N <= 1000) {
            for (int i = 0; i < N; i++){
                int score = sc.nextInt();
                if (score > max){
                    max = score;
                } 
                sum += score;
            }
            newAvg = (sum * 100.0) / max / N;
            System.out.println(newAvg);
        }
    }
}