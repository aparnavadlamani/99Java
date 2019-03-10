import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class java6 {
    public static boolean isPalindrome(ArrayList<Integer> l)
    {
        List<Integer> lr = new ArrayList<Integer>(l);
        Collections.reverse(l);
        return Objects.equals(l,lr);
    }
    public static void main(String[] args)
    {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(2);
        l1.add(1);

        if(isPalindrome((ArrayList<Integer>) l1))
            System.out.println("Is Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
