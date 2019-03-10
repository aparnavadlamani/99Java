import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class java9 {
    public static List<List<Integer>> packfun(List<Integer> l)
    {
        List<List<Integer>> pack = new ArrayList<>();
        List<Integer> lp = new ArrayList<>();
        Integer element = null;
        for(Integer i : l)
        {
            if(!Objects.equals(element, i))
            {
                lp = new ArrayList<>();
                pack.add(lp);
            }
            lp.add(i);
            element = i;
        }
        return pack;
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

        List<List<Integer>> nested = new ArrayList<>();
        nested = packfun(l1);
        System.out.println(nested);
    }
}
