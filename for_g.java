import java.util.Scanner;

public class for_g {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();


        for(int i = 2; i <= x; i++){

            if(x % i == 0){
                System.out.print(i + " ");
                break;
            }
        }
    }
}