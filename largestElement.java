// package dsa.arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class largestElement {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int t= scan.nextInt();
        int[] arr= new int[t];
        int i = 0;
        while(t-- != 0 )
        {
            arr[i++]= scan.nextInt();
        }
        // sorting using selection sort

        // for(i= 0; i< arr.length; i++)
        // {
        //     for(int j=i+1; j< arr.length ; j++)
        //     {
        //         if(arr[i] > arr[j])
        //         {
        //             int dummy= arr[i];
        //             arr[i]= arr[j] ;
        //             arr[j]= dummy;

        //         }
        //     }
        // }
    //     Arrays.sort(arr);
    //    System.out.println("largest element is "+ arr[arr.length -1]);

        largestElement obj= new largestElement();
        int secondLargest = obj.secondLargest(arr);
        System.out.println(secondLargest);
        System.out.println(obj.secondSmallest(arr));
       scan.close();


    }

    int secondLargest(int[] arr)
    {
        int l, s, l2;
        s= l2=  l= arr[0];
        int len= arr.length;
        for(int i= 1; i< len; i++)
        {
            if(arr[i]> l){
                l= arr[i];
            }
            
            if(arr[i]< s){
                s= arr[i];
            }
        }
        for(int i=1; i< len; i++)
        {
            if(l != arr[i] && l2 < arr[i]  )
            {
                l2= arr[i];
            }
        }
        
        

        return l2;
    }

    int secondSmallest(int[] arr)
    {
        int min, min2;
        min = min2 = arr[0];
        for(int i= 1; i< arr.length; i++)
        {
            if(min > arr[i])
            {
                min= arr[i];
            }
        }

        for(int i=1; i< arr.length; i++)
        {
            if(min != arr[i] && min2 > arr[i])
            {
                min2= arr[i];
            }
        }

        return min2;
    }
}


