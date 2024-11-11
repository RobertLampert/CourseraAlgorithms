import java.util.*;
//import java.io.*;

public class maxpairproduct {
       static long pairProduct(int[] nums){
        Arrays.sort(nums);
        int i = nums.length-1;
        int j = nums.length-2;
        long maxInt1 = nums[i];
        long maxInt2 = nums[j];
        long answer = maxInt1 * maxInt2;
        return answer;
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers;
        numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(pairProduct(numbers));
        scanner.close();
    }

    //static class arrScanner {}
}
