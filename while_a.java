import java.util.Scanner;

public class while_a {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 0;
        while(i < n){
            i++;
            int j = (int)Math.sqrt(i);
            if(j*j == i) System.out.println(i);
        }
    }
}