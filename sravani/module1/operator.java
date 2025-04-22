import java.util.*;
public class operator {
    public static void main(String x[])
    {
        int firstinteger=10,secondinteger=10,sum=0,diff=0,mul=0,div=0,mod=0,m=97,choice=0;
        char ch='a';
        //arithemetic
        sum = firstinteger + secondinteger;
        diff = firstinteger - secondinteger;
        mul = firstinteger * secondinteger;
        div = firstinteger / secondinteger;
        mod = firstinteger % secondinteger;
        System.out.println("\nrelational\n" + (ch == firstinteger) + " " + (firstinteger > secondinteger) + " "+ (firstinteger < 
        secondinteger)+ " " + (firstinteger >= secondinteger) + " " + (firstinteger <= secondinteger) + " " + (firstinteger != secondinteger));
        //ternary
        boolean ternary = (sum > diff)?true:false;
        System.out.println("\nArithemetic\nsum=" + sum + "\ndiff=" + diff + "\nmul" + mul + "\ndiv" + div + "\nmod=" + mod);
        //logical
        System.out.println("\nlogical and=" + ((firstinteger > secondinteger) && (firstinteger > 0)) + "\nlogical or=" +
        ((firstinteger > secondinteger)||(firstinteger > 0)) + "\nlogical not=" + (!((firstinteger > secondinteger) && 
        (firstinteger > 0))));
        System.out.println("\nternary "+ternary);
        //bitwise
        System.out.println("\nleft shift=" + (firstinteger << 1) + " right shift=" + (firstinteger >> 1) + " bitwise not=" +
        (firstinteger ^ secondinteger) + " bitwise and=" + (firstinteger & secondinteger) + " bitwise or=" + (firstinteger | secondinteger)
        + " negation " + (~(firstinteger)));
        System.out.println("\nincrement " + (secondinteger++) + " decrement " + (secondinteger--));
        //assignment
        firstinteger += 10;
        secondinteger -= 10;
        sum *= 1;
        sum /= 1;
        mul %= 5;
        System.out.println("\nassignment " + firstinteger + " " + secondinteger + " " + sum + " " + sum + " " + mul);
        //if else
        if(firstinteger > secondinteger)
        System.out.println("\nfirstinteger is greater than second integer");
        else
        System.out.println("\nfirstinteger is less than second integer");
        //switch 
        String Days[]={"monday" , "tuesday" , "wednesday" , "thursday" , "friday" , "saturday" , "sunday"}; 
        choice = (int)(Math.random() * 7);
        switch(choice)
        {
            case 1 -> System.out.println(Days[0]);
            case 2 -> System.out.println(Days[1]);
            case 3 -> System.out.println(Days[2]);
            case 4 -> System.out.println(Days[3]);
            case 5 -> System.out.println(Days[4]);
            case 6 -> System.out.println(Days[5]);
            case 7 -> System.out.println(Days[6]);

        }

        
        

    }
}
