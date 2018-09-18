import  java.util.*;
public class Prb {

    public  static  void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Numinwords nw = new Numinwords(n);
        System.out.println(nw.inWords());
    }
}
