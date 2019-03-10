import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class java35 {
    static List<Integer> primefs(int a)
    {
        List<Integer> l = new ArrayList<>();
        int count=0;
        for(int i=2;i<=a;i++) {
            if (a%i == 0) {
                if (isprime(i) == 1) {
                    l.add(i);
                }
            }
        }
        return l;
    }
    static int isprime(int x)
    {
        int flag=1;
        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0){
                flag=0;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args)
    {
        int m;
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        List<Integer> l1 = new ArrayList<>();
        l1 = primefs(m);
        System.out.println(l1);
    }
}
