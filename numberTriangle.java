public class numberTriangle{
        void binaryTriangle(int n){
            //
            int num=1;
            for(int i=0; i<n;i++)
            {   
                if(i%2==0)
                    num=1;
                else{
                    num=0;
                }
                for(int j=0; j<=i; j++){
                System.out.print(num);
                    num= 1-num;
                }
                System.out.println();
            }
        }

        
        void numberCrown(int n)
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                //left side of inverted invisible triangle
                for(int j=n;j>i;j--)
                {
                        System.out.print(" ");
                }
                // right side of inverted invisible triangle
                for(int m=n-1;m>i;m--){
                    System.out.print(" ");
                }
                //reverse digit triangle
                for(int l=i;l>=1;l--)
                {
                    System.out.print(l);
                }
                System.out.println();
            }
        }



        void numSumTriangle(int n)
        {
            int num=0;
            for (int i=0;i<n; i++)
            { 
                
                for(int j=1; j<=i; j++){
                    num+=1;
                    System.out.print(num+"   ");
                }
                System.out.println();
            }
        }



}