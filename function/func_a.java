import java.util.Scanner;

public class func_a {
    static int min(int a,int b,int c,int d){
            return Math.min(a, Math.min(b,Math.min(c,d)));
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        System.out.print(min(a,b,c,d));
    }
}