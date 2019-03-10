import java.io.*;
import java.util.*;

public class java3 {
    public static void main(String[] args){
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        Scanner scan = new Scanner(System.in);
        int k;
        k = scan.nextInt();
        System.out.println(l1.get(k-1));
    }
}
