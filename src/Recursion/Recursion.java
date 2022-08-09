package Recursion;

public class Recursion {

    public static void main(String[] Args)
    {
        System.out.println("The factorial of 4 is: " + Factorial(4));
        System.out.println("The factorial of 6 is: " + Factorial(6));
    }

    public static int Factorial(int N)
    {
        if (N == 1)
            return 1;
        else
            return (N * Factorial(N-1));
    }
}
