package Functional_interface;

import java.util.function.Function;
public class StringLengthChecker
{
    public static void main(String[] args)
    {
        Function<String, Integer> getLength = s -> s.length();
        String message = "Hello World";
        int result = getLength.apply(message);
        if (result > 10)
        {
            System.out.println("Message exceeds limit");
        }
        else
        {
            System.out.println("Message within limit");
        }
    }
}