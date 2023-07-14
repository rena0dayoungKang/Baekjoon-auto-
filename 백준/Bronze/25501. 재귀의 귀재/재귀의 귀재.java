import java.util.Scanner;
public class Main{
    
    static int count = 0; 
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        
        for(int i = 0; i < testcase; i++){
            count = 0; 
            String str = sc.next();
            System.out.println(isPalindrome(str) + " " + count);
        }
        sc.close();
    }
    
    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) {  
            return 1; //문자 하나인 경우 항상 페닌드롬
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        } else {
            return recursion(s, l+1, r-1);
        }
    }
    
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length() - 1);
    }
}