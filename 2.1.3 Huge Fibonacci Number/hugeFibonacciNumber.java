import java.util.*;
import java.math.BigInteger;

public class hugeFibonacciNumber {
    static BigInteger fib(BigInteger n, BigInteger d)
    {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c;
        ArrayList <BigInteger> Fibonacci = new ArrayList<>();
        BigInteger largerNum = n.max(d);
        for(BigInteger i = BigInteger.valueOf(0); i.compareTo(largerNum.multiply(largerNum))<0; i=i.add(BigInteger.valueOf(1))){
            Fibonacci.add(a);
            c = (a.add(b)).mod(d);
            a=b;
            b=c;
            if(a.equals(BigInteger.valueOf(0))&&b.equals(BigInteger.valueOf(1))){
                BigInteger period = i.add(BigInteger.valueOf(1));
               // System.out.println("found");
                //System.out.println(Fibonacci);
                BigInteger index = n.mod(period);
                return Fibonacci.get(index.intValue());
            }
        }
        return BigInteger.valueOf(10);
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        BigInteger m = scanner.nextBigInteger();
        System.out.println(fib(n, m));
        scanner.close();
    }
};
