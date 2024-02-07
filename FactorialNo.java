import java.util.*;

public class FactorialNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int ans=1;
        if(num >0)
        {
        for(int i=1;i<=num;i++)
        {
            ans=ans*i;
            System.out.println(ans);
        }
        System.out.println("Factorial of given number");
        System.out.println(num+"="+ans);
        }
    }
}