import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        for(char c = 'a'; c <= 'z'; c++) {
            int index = str.indexOf(c);
            System.out.print(index +" ");
        }
    }
}