import java.util.Scanner;
import java.io.*;

public class java32 {
    public static void main(String[] args)
    {
        int a,b;
        int max;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else if(a<b)
                b=b-a;
        }
        System.out.println(a);
    }
}
