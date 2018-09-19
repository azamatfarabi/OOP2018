import java.util.Scanner;

public class Func_c {

    static int Xor(int x,int y){
        if (x != y){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.print(Xor(x,y));
    }
}