
public class longestSubarray{
    public static void main(String[] args)
    {
        int[] arr={2,3,5,1,9};
        int n=arr.length;
        int k=9;
        Approach obj=new Approach();
        // Approach 1
        // Find the length of the longest subarray with sum k
        int result=obj.approach1(arr, n, k);
        System.out.println("The length of the longest subarray with sum " + k + " is: " + result);
    }
}

class Approach{
    int approach1(int[] arr, int n, int k)
    {
        int maxLength=0;
        int sum=0;
        int start=0;
        for(int i=0; i<n; i++)
        {
            sum=0;
            start=1;
            sum+=arr[i];

            try{
                int j=i+1;
                while(sum< k)
                {
                    sum+=arr[j];
                    start++;
                    j++;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                break;
            }
            finally
            {
                if(sum==k)
                {
                    maxLength= Math.max(start, maxLength);
                }
            }
            
        }
        return maxLength;
    }
}