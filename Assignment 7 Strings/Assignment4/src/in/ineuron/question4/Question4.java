package in.ineuron.question4;
import java.util.*;

public class Question4 {
	public static void reverse(String str)
    {
        String word;
        StringTokenizer iss = new StringTokenizer(str);
        while (iss.hasMoreTokens()) {
            word = iss.nextToken();
            System.out.print(
                new StringBuilder(word).reverse().toString()
                + " ");
        }
    }
 
    public static void main(String[] args)
    {
        String s = "Let's take LeetCode contest";
        reverse(s);
    }

}
