import java.util.Scanner;

public class array_a {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int [] a = new int[n];

        for (int i = 0;i < n;i++){
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < n;i++){
            if(i % 2 == 0) System.out.print(a[i] + " ");
        }

    }
}
