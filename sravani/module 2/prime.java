import java.util.*;
public class prime {
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        int startinglimit = sc.nextInt();
        for(int i = 1 ; i <= 5;)
        {
            if(isPrime(startinglimit))
            {
            System.out.println(startinglimit);
            i++;
            }
            startinglimit++;
        }
        sc.close();
    }
    public static boolean isPrime(int number)
    {
        if(number == 0 || number == 1)
        return false;
        for(int i = 2 ; i <= number / 2 ; i++)
        {
            if(number % i == 0)
            return false;
        }
        return true;
    }
}
