import java.util.*;
public class inttobinary {
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        StringBuilder stringanswer = new StringBuilder();
        while(integer > 0)
        {
           stringanswer.append(integer % 2);
           integer = integer / 2;
        }
        System.out.println(stringanswer.reverse());
        sc.close();
    }
}
