import java.util.*;

public class FibonacciNos{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter how many Fibonacci series you want: ");
        int num = sc.nextInt();
        int ans=0,n1=1,n2=0;
        System.out.println("Fibonacci series:");

        if(num > 0)
        {
            for(int i=1;i<=num;i++)
            {
                ans=n1+n2;

                System.out.println(n2);
                n2=n1;
                n1=ans;
            }
        }


    }
}