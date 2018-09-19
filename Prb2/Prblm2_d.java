import java.util.Scanner;

public class Prblm2_d {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int x = input.nextInt();

    if (x > 0){
        System.out.println("1");
    }else if (x < 0){
        System.out.println("-1");
    }else{
        System.out.println("0");
    }
}
}