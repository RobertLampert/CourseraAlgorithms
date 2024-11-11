import java.util.*;
import java.math.BigInteger;

public class lastDigitFibSum {
    static BigInteger fib(BigInteger n)
    {
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(2);
        BigInteger c;
        ArrayList<BigInteger> Fibonacci = new ArrayList<BigInteger>();
        Fibonacci.add(BigInteger.valueOf(0));
        Fibonacci.add(a);
        Fibonacci.add(b);
        for(int i=2;i<59;i++){
            c = (a.add(b)).add(BigInteger.valueOf(1)).mod(BigInteger.valueOf(10));
            a=b;
            b=c;
            Fibonacci.add(c);
        }
        BigInteger fibMod = n.mod(BigInteger.valueOf(60));
        return Fibonacci.get(fibMod.intValue());
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        System.out.println(fib(n));
        scanner.close();
    }
};
