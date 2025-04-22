package day1;
import java.util.Scanner;
public class starpattern {
    public static void main(String x[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter input:");
    int input = sc.nextInt();
    System.out.println("enter character:");
    char character = sc.next().charAt(0);
    // printing upper pattern
    for(int i = 0 ; i < input ; i++)
    {
        if(i==0)
        {
            for(int j = 0 ; j < ((2 * input)- 1)  ; j++)
            System.out.print(character+" "); 
        }
        else
        {
        for(int j = 0 ; j < input - i ; j++)
        System.out.print(character + " ");
        for(int j = 0 ; j < (i * 2) - 1 ; j++ )
        System.out.print("  ");
        for(int j = 0 ; j < input - i ; j++)
        System.out.print(character + " ");
        }
        System.out.println();
    }
    // printing down pattern
    for(int i = input - 2 ; i >= 0; i--)
    {
        if(i==0)
        {
            for(int j = 0 ; j < ((2 * input)- 1)  ; j++)
            System.out.print(character+" "); 
        }
        else
        {
        for(int j = 0 ; j < input - i ; j++)
        System.out.print(character + " ");
        for(int j = 0 ; j < (i * 2) - 1 ; j++ )
        System.out.print("  ");
        for(int j = 0 ; j < input - i ; j++)
        System.out.print(character + " ");
        }
        System.out.println();
    }
    }
}
