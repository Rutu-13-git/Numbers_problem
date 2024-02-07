import java.util.*;

public class PalindromeNo{

    public static void main(String args[]){
        int temp=0,ans=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int num=sc.nextInt();
        
        int n1=num;

        while(n1 != 0){
            temp= n1%10;
            n1=n1/10;

            ans=ans*10+temp;            
            
        }
        if(ans==num)
        {
            System.out.println("Given number is palindrome number");
        }
        else
        {
            System.out.println("Given number is not palindrome number");
        }
    }
}