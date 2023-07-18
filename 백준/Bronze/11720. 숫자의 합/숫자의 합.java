import java.util.*;
public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        if (1 <= N && N <= 100){            
            String strNum = sc.next();
            char[] cNum = strNum.toCharArray();
            
            if (cNum.length != N){
                System.out.println("입력한 숫자의 자릿수가 틀렸습니다.");
            } else {
                int sum = 0;
                for(int i = 0; i < cNum.length; i++){
                    sum += cNum[i] - '0';
                }
                System.out.print(sum);
            }
        }
        sc.close();
    }
}