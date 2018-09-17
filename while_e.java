import java.util.Scanner;

public class while_e {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = 0;
        int i = 1;
        while (i < n){
            i *= 2;
            k++;
        }

        System.out.print(k);
    }
}