import java.util.Scanner;
class BubbleSort 
{
    void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n ; i++)
			for (int j = 0; j < n - i-1 ; j++)
				if (arr[j] > arr[j + 1]) 
                {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
class BubbleDemo 
{
    public static void main(String args[])
	{
		BubbleSort ob = new BubbleSort();
		int arr[],n;
        System.out.print("How Many Number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        arr= new int[n];
        for(int i=0;i<n;i++)
        { 
            System.out.print("Enter Item "+(i+1)+" :");
            arr[i]=sc.nextInt();
        }
		ob.bubbleSort(arr);
		System.out.println("Sorted Array: ");
		ob.printArray(arr);
	}
}
