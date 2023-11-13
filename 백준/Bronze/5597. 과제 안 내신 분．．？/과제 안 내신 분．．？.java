import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] homeworks = new boolean[30];
        
        for (int i = 0; i < 28; i++) {
            int submitStd = sc.nextInt();
            homeworks[submitStd -1] = true;
        }
        
        for (int i = 1; i < 31; i++) {
            if (!homeworks[i-1]) {
                System.out.println(i);
            }
        }
    }
}