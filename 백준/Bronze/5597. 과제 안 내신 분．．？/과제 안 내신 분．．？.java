import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] homeworks = new boolean[30];
        
        for (int i = 0; i < 28; i++) {
            int submitStd = sc.nextInt();
            homeworks[submitStd -1] = true;
        }
        
        for (int i = 0; i < 30; i++) {
            if (!homeworks[i]) {
                System.out.println(i+1);
            }
        }
    }
}