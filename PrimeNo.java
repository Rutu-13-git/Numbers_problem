import java.util.*;

public class PrimeNo
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers:");
        int num = sc.nextInt();
        int cnt=0,flag=0;
       
        for(int i=2;i<=num/2;i++)
        {
            if(num %i==0)
            {
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("given number is prime number");
        }
        else
        {
             System.out.println("given number is not prime number");
        }

    }
}