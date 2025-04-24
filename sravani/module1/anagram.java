import java.util.*;
public class anagram {
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        String stringone = sc.nextLine();
        String stringtwo = sc.nextLine();
        char chararrayone[] = stringone.toCharArray();
        char chararraytwo[] = stringtwo.toCharArray();
        Arrays.sort(chararrayone);
        Arrays.sort(chararraytwo);
        if(Arrays.equals(chararrayone , chararraytwo))
        System.out.println("yes both are anagrams");
        else
        System.out.println("not anagrams");
        sc.close();
    }
}
