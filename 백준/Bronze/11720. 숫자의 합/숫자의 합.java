import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.nextLine());
        //int N = sc.nextInt(); 을 안쓰는 이유는 nextInt()는 개행을 읽을 수 없기 때문에 아래에서 nextLine() 을 읽는다면 공백이 str에 저장되게 됨
        String str = sc.nextLine();
        String[] numbers = str.split("");
        
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(numbers[i]);
            sum += number;
        }
        
        System.out.print(sum);
    }
}
