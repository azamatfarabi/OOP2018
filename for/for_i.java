import java.util.Scanner;

public class for_i {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        int cnt = 0;
        for(int i = 1; i <= Math.sqrt(x); i++){
            if(x % i == 0){
                cnt++;
            }
        }

        if ((int)Math.sqrt(x)*(int)Math.sqrt(x) == x){
            cnt = cnt*2 -1;
        }else {
            cnt *= 2;
        }
        System.out.print(cnt);
    }
}