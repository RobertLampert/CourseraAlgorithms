import java.util.*;
import java.math.BigInteger;

public class greatestCommonDivisor {
    static BigInteger GCD(BigInteger m, BigInteger n)
    {   
        BigInteger a = m;
        BigInteger b = n;
        BigInteger r = BigInteger.valueOf(1);
        while(r.compareTo(BigInteger.valueOf(0))!=0){
            r=a.mod(b);
            a=b;
            b=r;
        }
        return a;
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        BigInteger m = scanner.nextBigInteger();
        BigInteger n = scanner.nextBigInteger();
        System.out.println(GCD(m,n));
        scanner.close();
    }
};
