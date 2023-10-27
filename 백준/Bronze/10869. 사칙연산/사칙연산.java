import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        sc.close();
        
        int sum = A + B;
        int minus = A - B;
        int multiple = A * B;
        int division = A / B;
        int rest = A % B;
        
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multiple);
        System.out.println(division);
        System.out.println(rest);
        
    }
}