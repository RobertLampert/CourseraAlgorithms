import java.util.*;

public class maximumSalary {
    static int firstDigit(int x) {
        while (x > 9) {
            x /= 10;
        }
        return x;
    }
    
    static String calculateSalary(int numInts, int[] Nums){
        ArrayList<Integer> seperatedNumbers = new ArrayList<Integer>();
        for(int i = 0; i < numInts; i++){
            seperatedNumbers.add(Nums[i]);
        }
        System.out.println(seperatedNumbers);
        //Collections.sort(seperatedNumbers, (a,b) -> {a=firstDigit(a); b=firstDigit(b);return -1 * a.compareTo(b);});
        Collections.sort(seperatedNumbers, (a,b) -> {return -1 * a.compareTo(b);});
        System.out.println(seperatedNumbers);
        ArrayList<Integer> singleDigits = new ArrayList<Integer>();
        ArrayList<Integer> doubleDigits = new ArrayList<Integer>();
        ArrayList<Integer> tripleDigiIntegers = new ArrayList<Integer>();
        singleDigits.addAll(seperatedNumbers);
        doubleDigits.addAll(seperatedNumbers);
        tripleDigiIntegers.addAll(seperatedNumbers);
        singleDigits.removeIf(n -> n > 9);
        doubleDigits.removeIf(n -> n < 10 || n > 99);
        tripleDigiIntegers.removeIf(n -> n < 100);
        System.out.println(singleDigits);
        System.out.println(doubleDigits);
        System.out.println(tripleDigiIntegers);
        String answer = "";
        for(int i = 0; i < numInts; i++){
            answer = answer + seperatedNumbers.get(i);
        }
        return answer;
    }
    
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int numDigits = scanner.nextInt();
        int[] Numbers = new int[numDigits];
        for(int i = 0; i < numDigits; i++){
            Numbers[i] = scanner.nextInt();
        }
        //System.out.println(Arrays.toString(Numbers));
        System.out.println(calculateSalary(numDigits, Numbers));
        scanner.close();
    }
};
