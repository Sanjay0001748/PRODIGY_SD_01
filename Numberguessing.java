package Internship;
import java.util.Scanner;

public class Numberguessing {


     static void numberguess()
     {
        int number=1+(int)(100*Math.random());
        
        System.out.println("guess a number between 1 to 100 in 5 trails");
        Scanner sc=new Scanner(System.in);
        int k=5;//trails
        int i;
        for( i=0;i<k;i++)
        {
            System.out.println("enter the  number to guess");
            int guess=sc.nextInt();

            if(number==guess)
            {
                System.out.println("you guessed the right number");
                break;
            }
            else if(number>guess && i!=k-1)
            {
                System.out.println("the number is greater than your guess");
               

            }
            else if(number<guess && i!=k-1)
            {
                System.out.println("the number is less than your guess");
            }

        }
        if(i==k)
        {
            System.out.println("you have exhausted 5 trails");
            System.out.println("the number was "+ number);
        }
       

        

     }
    
    
    
    
    
    public static void main(String[] args) {
        numberguess();
       

    }
}
