import java.util.Scanner;

public class Prblm2_a {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
        //System.out.println(Math.max(a,b));
    }
}