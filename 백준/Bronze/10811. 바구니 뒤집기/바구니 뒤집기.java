import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //5
        int m = sc.nextInt();   //4

        int arr[] = new int[n]; //

        for (int i = 0; i < n; i++) {
            arr[i] = (i + 1);
        }

        for (int k = 0; k < m; k++) {
            int i = sc.nextInt();   //1
            int j = sc.nextInt();   //2

            for (int l = (i - 1); l < j; l++) {
                int nn = --j;

                int tmp = arr[l];
                arr[l] = arr[nn];
                arr[nn] = tmp;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }   
}
