//import java.lang.Math.*;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args)
    {
        Scanner t= new Scanner(System.in);
        int num= t.nextInt();
        int revNum=0;
        int temp=num;
        
        while(temp> 0){
            int rem= temp%10;
            revNum= (revNum)*10 + rem;
            temp= temp/10;
            
        }

        if (revNum== num)
        System.out.println("palindrome");
        else{
            System.out.println("not palindrome");
        }
        t.close();
        System.out.println(revNum);
    }
}
