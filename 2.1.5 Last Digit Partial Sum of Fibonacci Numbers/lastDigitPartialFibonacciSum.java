import java.util.*;
import java.math.*;

public class lastDigitPartialFibonacciSum{
       public static BigInteger partialSum(BigInteger m, BigInteger n){
        ArrayList<BigInteger> FibonacciPeriod = new ArrayList<BigInteger>();
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c;
        FibonacciPeriod.add(a);
        FibonacciPeriod.add(b);
        for(int i =2;i<60;i++){
            c = a.add(b).mod(BigInteger.valueOf(10));
            a=b;
            b=c;
            FibonacciPeriod.add(c);
        }
        //System.out.println(FibonacciPeriod);
        BigInteger newM = m.mod(BigInteger.valueOf(60));
        BigInteger newN = n.mod(BigInteger.valueOf(60));
        //System.out.println("newM " + newM + " newN " + newN);
        BigInteger sum = BigInteger.valueOf(0);
        if(newN.compareTo(newM)>0){
            for(int i = newM.intValue();i<=newN.intValue();i++){
                sum=sum.add(FibonacciPeriod.get(i));
            }
            return sum.mod(BigInteger.valueOf(10));
        }else{
            for(int i = newM.intValue();i<60;i++){
                sum=sum.add(FibonacciPeriod.get(i));
            }
            for(int i = 0;i<=newN.intValue();i++){
                sum=sum.add(FibonacciPeriod.get(i));
            }
            return sum.mod(BigInteger.valueOf(10));
        }
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        BigInteger m = scanner.nextBigInteger();
        System.out.println(partialSum(n, m));
        scanner.close();
    }
}
