import java.util.Scanner;

public class for_k {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1;i <= n;i++){
            int j = scan.nextInt();
            sum += j;
        }

        System.out.print(sum);
    }
}