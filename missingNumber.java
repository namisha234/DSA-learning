public class missingNumber {
    public static void main(String[] args) {
        int array[] = {1,2,4,5};
        Finder obj= new Finder();
        System.out.println(obj.xor(array));
    }
}

class Finder
{
    int summation(int[] a)
    {
        int N= a[a.length-1];
        int S1= (N* (N+1))/2;
        int S2=0;
        for (int i = 0; i < a.length; i++) {
            S2+=a[i];
        }

        return S1- S2;
    }

    int xor(int[] a)
    {
        // int xor1=0, xor2=0;
        for(int i=1; i<= a.length; i++)
        {
            if((a[i-1]^ i)!= 0)
            {
                return i;
            }

            // xor1= xor1^a[i-1];
            // xor2= xor2 ^ i;
            // System.out.printf("%d %d %d %d\n", a[i-1], xor1, i, xor2);
        }
        return -1;
        // return xor2 - xor1;
    }
}
