import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> remains = new HashSet<>();
        
        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            remains.add(number % 42);
        }
        
        System.out.println(remains.size());
    }
}