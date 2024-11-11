import java.util.*;
import java.math.BigInteger;

public class lastDigitFibSquareSum {
    static BigInteger fibSquareSum(BigInteger n)
    {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c;
        ArrayList<BigInteger> Fibonacci = new ArrayList<BigInteger>();
        Fibonacci.add(a);
        Fibonacci.add(b);
        for(int i=2;i<61;i++){
            c = (a.add(b)).mod(BigInteger.valueOf(10));
            a=b;
            b=c;
            Fibonacci.add(c);
        }
        for(int i =2;i<60;i++){
            Fibonacci.set(i, Fibonacci.get(i).multiply(Fibonacci.get(i+1)).mod(BigInteger.valueOf(10))); 
        }
        Fibonacci.remove(60);
        return Fibonacci.get(n.mod(BigInteger.valueOf(60)).intValue());
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        System.out.println(fibSquareSum(n));
        scanner.close();
    }
};
