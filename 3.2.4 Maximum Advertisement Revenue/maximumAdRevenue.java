import java.util.*;
import java.math.BigInteger;
public class maximumAdRevenue {
    static BigInteger calculateRevenue(int slots, ArrayList<BigInteger> prices, ArrayList<BigInteger> clicks)
    {   
        BigInteger total = BigInteger.valueOf(0);
        prices.sort(Comparator.reverseOrder());
        clicks.sort(Comparator.reverseOrder());
        //System.out.println(prices);
        //System.out.println(clicks);
        for(int i = 0; i < slots; i++){
            total = total.add(prices.get(i).multiply(clicks.get(i)));
        }
        return total;
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int slots = scanner.nextInt();
        ArrayList<BigInteger> clicks = new ArrayList<BigInteger>();
        ArrayList<BigInteger> prices = new ArrayList<BigInteger>();
        for(int i = 0; i < slots; i++){
            prices.add(scanner.nextBigInteger());
        }
        for(int i = 0; i < slots; i++){
            clicks.add(scanner.nextBigInteger());
        }
        System.out.println(calculateRevenue(slots,prices, clicks));
        scanner.close();
    }
};
