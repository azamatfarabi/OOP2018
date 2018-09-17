import java.util.Scanner;

public class Problem1_a {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        double res = Math.sqrt((n1 * n1) + (n2*n2));

        System.out.println(res);
    }
}