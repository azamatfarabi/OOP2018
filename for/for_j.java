import java.util.Scanner;

public class for_j {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int s = 0;

        for(int i = 1;i <= 100;i++){
            int j = scan.nextInt();
            s += j;
        }

        System.out.print(s);
    }
}