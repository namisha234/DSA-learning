import java.util.ArrayList;

public class checkSorting {
    public static void main(String[] args) {
        int[] arr= {1,1,3,3,5,0,0,0,8,8};
        removeDuplicate rd= new removeDuplicate();
        int size= rd.approach2(arr);
        for(int i=0; i<size; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

class Sort{
    boolean checkSort(int[] arr)
    {
        boolean flag= true;
        for(int i= 1; i< arr.length-2; i++)
        {
            if(arr[i]< arr[i-1] || arr[i]> arr[i+1])
            {
                flag= false;
                return flag;
            }

        }


        return flag;
    }
}

class removeDuplicate{
    // in approach1 new arrayList will be declared
    ArrayList<Integer> approach1(int[] arr)
    {
        ArrayList<Integer> empty= new ArrayList<>();
        for(int i= 0; i<arr.length-1; i++)
        {
            if(arr[i]== arr[i+1])
            {
                i++;
            }
            empty.add(arr[i]);
        }
        return empty;
    }

    int approach2(int[] arr)
    {
        
        int i=0,j;
        for(j=1; j<arr.length; j++)
        {
            if(arr[i]!= arr[j]){
                arr[i+1]= arr[j];
                i++;
            }
        }
        return i+1;
    }

    void approach3()
    {
        // using set which doesn not save repeated items only unique
    }
}
