import java.io.*;
import java.util.*;
public class java2 {
    public static void main(String[] args){
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        int elements = l1.size();
        System.out.println(l1.get(elements-2));
    }
}
