import java.util.Scanner;

public class array_e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];
        boolean ok = false;

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }


        for (int i = 1; i < n; i++) {
            if (a[i] * a[i - 1] > 0) {
                ok = true;
                break;
            }
        }

        if(ok){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }

    }
}