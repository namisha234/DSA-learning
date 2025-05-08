import java.util.ArrayList;
import java.util.Arrays;

public class unionArray {
    public static void main(String[] args)
    {
        ArrayList<Integer> join= new ArrayList<>();
        arrayFunction obj= new arrayFunction();
        int[] a1= {1,2,5,3,2};
        int[] a2= {1,2,7,6};
        
        join= obj.union(a1,a2);
        System.out.println(join+ "  "+ join.size());
    }
}

class arrayFunction{
    ArrayList<Integer> union(int[] a1, int[] a2)
    {
        ArrayList<Integer> join = new ArrayList<>(a1.length + a2.length);
        Arrays.sort(a1);
        Arrays.sort(a2);
        int len= (a1.length > a2.length) ? a1.length :a2.length;
        for(int i=0; i<len; i++)
        {
            try{

                join.add(a1[i]);
                join.add(a2[i]);
            }
            catch(Exception e){
                continue;
            }
        }
        sortArrayList(join);

        return join;
    }
    
    
    void sortArrayList(ArrayList<Integer> al)
    {
        // insertion sort
        for (int i = 1; i < al.size(); i++) 
        {
            for(int j= i; j > 0; j--)
            {
                if( al.get(j)< al.get(j-1))
                {
                    int temp= al.get(j);
                    al.set(j, al.get(j-1));
                    al.set(j-1, temp);
                }
            }
        }
        removeDuplicate(al);
    }
       
    void removeDuplicate(ArrayList<Integer> al)
    {
        int j=0;
        for (int i = 1; i < al.size(); i++) {
            if (al.get(i)!= al.get(j)) {
                al.set(j+1, al.get(i));
                j++ ;
            }

        }
        j++;
        int s= j;
        while(s< al.size())
        {
            al.remove(s);
        }
        al.trimToSize();
        
    }

}
