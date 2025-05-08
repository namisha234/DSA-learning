import java.lang.Math;

public class moveElements{
    public static void main(String[] args)
    {
        int[] arr={3,0,5,0,1,0,8};
        for(int i=0; i< arr.length; i++)
            System.out.print(arr[i]+ "\t");
        mover move= new mover();
        move.moveZeroApproach2(arr);

        System.out.println("\n Rotated Array");
        for(int i=0; i< arr.length; i++)
        {
            System.out.print(arr[i]+"\t");
        }

    }
}

class mover{
    public void moveLeftBy1(int[] a)
    {
        int first= a[0];
        for(int i=0; i< a.length -1; i++)
        {
            a[i]= a[i+1];
        }
        a[a.length - 1]= first;
    }


    public void moveLeftByNum(int[] a, int pos)
    {

        try {
             //approach using temporary arr
        int n= a.length;
        int[] temp= new int[pos];
        for(int i=0; i<pos; i++)
        {
            temp[i]= a[i];
        }

        //shifting to pos
        for(int i=0; i< n; i++)
        {
            if( i < n-pos)
                a[i]= a[i+pos];
            else
                a[i]= temp[Math.abs(i+2-n)];
                
            
        }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Moving number cannot be greater then length of array");
        }
       
    }


    public void moveZeroApproach1(int[] a)
    {
        
        for(int i=0; i<a.length-1; i++)
        {
            for(int j=i; j< a.length-1; j++)
            {
                if(a[j]== 0)
    
                {
                    int dummy= a[j];
                    a[j]= a[j+1];
                    a[j+1]= dummy;
    
                }
            }
        }
    }

    public void moveZeroApproach2(int[] a)
    {
        //getting p1 and p2 to point first zero element
        int p1= -1;
        for(int i=0; i< a.length; i++)
        {
            if (a[i]== 0) {
                p1= i;
                break;
            }
        }

        for(int i= p1+1; i< a.length ; i++)
        {
            if(a[i]!=0)
            {
                // switch cause p position is already pointing to zero
                a[p1]= a[i];
                a[i]=0;
                p1+=1;
            }

        }
    }
}