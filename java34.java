import java.io.*;
import java.util.Scanner;

public class java34 {
    static int gcd(int a, int b)
    {
        if(a==0)
            return b;
        else
            return gcd(b%a, a);
    }
    public static void main(String[] args)
    {
        int m;
        int phim=0;
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        for(int i=1;i<m;i++)
        {
            if(gcd(i,m)==1)
                phim+=1;
        }
        System.out.println(phim);
    }
}
