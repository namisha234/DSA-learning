public class countOnes {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1,0, 1,1,1,1};
        System.out.println(counter(nums));
    }

    static int counter(int[] a)
    {
        int count=0, max_count=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]== 1){
                count++;
            }
            else
                count=0;
            max_count= Math.max(max_count, count);
        }
        return max_count;
    }
}

