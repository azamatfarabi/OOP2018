import java.util.Scanner;

public class for_c {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        for(int i = a; i <= b; i++){
            int j = (int) Math.sqrt(i);
            if(j * j == i){
                System.out.print(i + " ");
            }
        }
    }
}