import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class java5 {
    public static void main(String[] args)
    {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        Collections.reverse(l1);
        System.out.println(l1);
    }
}
