import java.util.*;

public class moneyChange {
    static Integer calculateChange(Integer m)
    {   
        Integer counter = m/10;
        Integer remainder = m % 10;
        counter = counter + remainder/5;
        remainder = m % 5;
        counter = counter + remainder;
        return counter;
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Integer m = scanner.nextInt();
        System.out.println(calculateChange(m));
        scanner.close();
    }
};
