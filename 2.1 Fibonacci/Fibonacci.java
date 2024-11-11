import java.util.*;

public class Fibonacci {
       static int fibCompute(int fibNum){
        if(fibNum < 2 ){
            return fibNum;
        }else{
            ArrayList<Integer> Fibonacci = new ArrayList<Integer>();
            Fibonacci.add(0);
            Fibonacci.add(1);
            int i = 2;
            while(i < fibNum){
                Fibonacci.add(Fibonacci.get(i-1)+Fibonacci.get(i-2));
                i++;
            }
            int answer = Fibonacci.get(i-1)+Fibonacci.get(i-2);
            return answer;
        }

    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibCompute(n));
        scanner.close();
    }

    //static class arrScanner {}
}
