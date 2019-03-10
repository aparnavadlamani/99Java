import java.io.*;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class java35another {
    public static List<Integer> primefs(int m)
    {
        List<Integer> l = new ArrayList<>();
        while(m%2==0)
        {
            l.add(2);
            m=m/2;
        }
        for(int i=3;i<=Math.sqrt(m);i+=2)
        {
            while(m%i==0)
            {
                l.add(i);
                m=m/i;
            }
        }
        if(m>2)
            l.add(m);
        return l;
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
