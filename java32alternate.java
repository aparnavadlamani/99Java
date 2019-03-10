import java.io.*;
import java.util.Scanner;

public class java32alternate {
    static int gcd (int a,int b)
    {
        if(a==0)
            return b;
        else return gcd(b % a, a);
    }
    public static void main(String[] args)
    {
        int a,b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        int res = gcd(a,b);
        System.out.println(res);
    }
}
