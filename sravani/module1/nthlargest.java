import java.util.*;
public class nthlargest {
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int count = 0;
        int array[] = new int[length];
        for(int i = 0 ; i < length ; i++)
        {
            array[i] = sc.nextInt();
        }
        int nthlargest = sc.nextInt();
        for(int i = 0 ; i < length ; i++)
        { 
            count = 0;
            for(int j = 0 ; j < length ; j++)
            {
                if(i != j && array[i] > array[j])
                count++;
            }
            if( (length - count) ==  nthlargest)
            {
                System.out.println(array[i]);
                break;
            }
        sc.close();
        }
    }
}
