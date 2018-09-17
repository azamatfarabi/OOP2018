import java.util.Scanner;

public class for_m {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int cnt = 0;

        for (int i =0;i < n;i++){
            int j = scan.nextInt();
            if (j == 0){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}