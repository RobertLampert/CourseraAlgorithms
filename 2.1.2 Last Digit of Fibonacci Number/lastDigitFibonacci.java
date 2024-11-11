import java.util.*;

public class lastDigitFibonacci {
       public static ArrayList<Long>fibCompute(ArrayList<Long> arr){
            arr.add(0L);
            arr.add(1L);
            int i = 2;
            while(i < 61){
                arr.add(arr.get(i-1) + (arr.get(i-2)));
                i++;
            }
            return arr;
    } 

    static long lastDigit(int n, ArrayList<Long> arr){
        int remainder = n % 60;
        long fibNum = arr.get(remainder);
        long lastDigit = fibNum%10;
        return lastDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> Fibonacci = new ArrayList<Long>();
        fibCompute(Fibonacci);
        int n = scanner.nextInt();
        System.out.println(lastDigit(n, Fibonacci));
        scanner.close();
    }


}
