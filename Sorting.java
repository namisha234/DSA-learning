public class Sorting {
    /**
     * @param args
     */
    public static void main (String[] args)
    {
        //  objects creation
        
        Sort sort= new Sort();
        int[] arr={3,2,5,4,7,1};

        System.out.println("before");
        Sorting.display(arr);
        // sort.selectionSort(arr);
        // sort.insertionSort(arr);
        // sort.bubbleSort(arr);
        sort.mergeSort(arr, 0, arr.length-1);
        System.out.println("After :");
        Sorting.display(arr);
    }

    static void display(int[] a)
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }
}

class Sort{

    void selectionSort(int[] a)
    {
        /*
            *select smallest from outer loop length 
         */

       for(int i =0; i< a.length-1; i++)
       {
            int smallestIndex= i;
            for(int j=i+1; j< a.length; j++)
            {
                if(a[j]< a[smallestIndex])
                {
                    smallestIndex= j;
                }
            }
            
            
                int temp= a[i];
                a[i]= a[smallestIndex];
                a[smallestIndex]= temp;
            
       }
    }

    void insertionSort(int[] a)
    {
        // a[0 ] is always sorted 

        for(int i=1; i< a.length; i++)
        {
            /*
            
                int j=i;
                while( j>0 && a[j] < a[j-1] )       //j-1 is sorted part 
                {
                    int temp= a[j];
                    a[j]= a[j-1];
                    a[j-1]= temp;
                    j--;
                }

             */
            for(int j=i; j>0; j--)
            {
                if(a[j]< a[j-1])
                {
                    int temp= a[j];
                    a[j]= a[j-1];
                    a[j-1]= temp;
                }
            }
        }
    }


    void bubbleSort(int[] a)
    {
        for(int i=0; i< a.length-1; i++)
        {
            for(int j=0; j< a.length-1-i; j++ )
            {
                if (a[j]> a[j+1])
                {
                    int temp= a[j];
                    a[j]= a[j+1];
                    a[j+1]= temp;
                }
            }
        }
    }

    void mergeSort(int[] a, int left, int right)
    {
        if(left>= right) return;
        int mid= (left+ right)/2;
        mergeSort(a, left, mid);
        mergeSort(a, mid+1, right);
        merge(a, left, mid, right);
    }

    void merge(int[] a, int l, int m, int r)
    {
        for (int i = 0; i < mid+1; i++) {
            
        }
    }
}