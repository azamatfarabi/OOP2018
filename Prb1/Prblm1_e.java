import java.util.Scanner;

public class Prblm1_e {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(((a * b % 109) + 109) % 109);
    }
}