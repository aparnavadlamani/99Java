import java.io.*;
import java.util.Scanner;

public class java33 {
    static int gcd(int c, int d)
    {
        if(c==0)
            return d;
        else
            return gcd(d%c, c);
    }
    public static void main(String[] args)
    {
        int a,b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        if(gcd(a,b)==1)
            System.out.println("Are Co-prime");
        else
            System.out.println("Are not co-prime");
    }
}
