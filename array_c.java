import java.util.Scanner;

public class array_c {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int [] a = new int[n];
        int cnt = 0;

        for (int i = 0;i < n;i++){
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < n;i++){
            if(a[i] > 0) cnt++;
        }

        System.out.print(cnt);
    }
}