import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class java8 {
    public static List<Integer> eledups(List<Integer> l)
    {
        List<Integer> res = new ArrayList<>();
        Integer element = null;
        for(Integer i : l)
        {
            if(!Objects.equals(element, i))
                res.add(i);
            element = i;
        }
        return res;
    }
    public static void main(String[] args)
    {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(1);
        l1.add(1);
        l1.add(1);
        l1.add(2);
        l1.add(2);
        l1.add(2);
        l1.add(3);

        List<Integer> l2 = new ArrayList<>();
        l2 = eledups(l1);
        System.out.println(l2);
    }
}
