class LargeSmall {
    void Process()
    {
        int[] A={5,9,200,12,17,28,100,1};
        int l=A.length;
        int i,temp=A[0],temp1=A[0];
        for(i=0;i<l;i++)
        {
            if(A[i]>temp)
            temp=A[i];

            if(A[i]<temp1)
            temp1=A[i];
        }
        System.out.println("Largest Number is: "+temp+"\nSmallest Number is: "+temp1);
    }
    public static void main(String[] args) {
        LargeSmall ob= new LargeSmall();
        ob.Process();  
    }

    
}
