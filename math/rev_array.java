package math;


public class rev_array{
    public static void main(String[] args) throws Exception
    {
        int n=8;
        int[] a1= {1,2,3,4,5,6,7,8};
        rev_array obj= new rev_array();
        obj.swap(a1,n);
        
    }

    void swap(int a[],int l)
    {
        int  p2=l-1;
        for(int i=0; i< (l/2) ; i++){
            int temp= a[i];
            a[i]= a[p2];
            a[p2]= temp;
            p2--;
            

        }
        parray(a, l);
    }

    void reverse(int a[], int l){
        int[] r=new int[l];
        
        for(int i= l-1, j=0; i>=0;  i--, j++)
        {
            r[j]= a[i];
        }
        parray(r, l);
    }

    void parray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}