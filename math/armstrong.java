package math;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        int_functions obj= new int_functions();
        int num= t.nextInt();
        int temp=num;
        int l= obj.length_int(num);
        int sum=0;
        for(int i=0; i<l; i++)
        {
            int individual_num= temp%10;
            sum= sum+ (int) Math.pow(individual_num, l);
            temp/=10;
        }
        System.out.println("num = "+ num+ " sum = "+ sum);
        t.close();
    }
}
class int_functions{
    int length_int(int n){
        int len=0;
        while(n>0){
            n=n/10;
            len++;
        }
        return len;
    }
}
    
