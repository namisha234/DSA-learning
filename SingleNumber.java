public class SingleNumber{
    public static void main(String[] args)
    {
        int[] arr= {3,14,3,14,1,1};
        SingleNumber sn= new SingleNumber();
        System.out.println(sn.approach1(arr));
    }

    int approach1(int[] a)
    {
        int xor= 0;
        for(int i=0; i< a.length; i++)
        {
            xor^=a[i];
        }
        if(xor==0){
            System.out.println("no number is repeated");
        }
        return xor;
    }
}