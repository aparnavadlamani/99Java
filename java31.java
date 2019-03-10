import java.io.*;
import java.util.Scanner;
public class java31 {
    public static void main(String[] args)
    {
        int k;
        int flag=0;
        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();
        for(int i=2;i<=k/2;i++)
        {
            if(i%k==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Is Prime");
        else
            System.out.println("Is not prime");
    }
}
