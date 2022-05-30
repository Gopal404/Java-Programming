class ArrRev {
    int arr1[]={1,2,3,4,5};
    int n,i,flag=0;
    public void Process()
    {
        for(i=0;i<n;i++)
        {
            // if (arr1[i]!=arr2[i])
            // {
            //     flag=1;
            // }
            System.out.println(arr1[i]);
        }
    }
    public static void main(String args[])
    {
        ArrCom obj = new ArrCom();
        obj.Process();
    }  
    
}
