
public class SelectionSort {

	void sort(int num[])
    {
        int n = num.length;
 
        for (int i = 0; i < n-1; i++)
        {
            
            int sidx = i;
            for (int j = i+1; j < n; j++)
                if (num[j] < num[sidx])
                    sidx = j;
            int temp = num[sidx];
            num[sidx] = num[i];
            num[i] = temp;
        }
    }
    void printArray(int num[])
    {
        int n = num.length;
        for (int i=0; i<n; ++i)
            System.out.print(num[i]+" ");
        System.out.println();
    }

	public static void main(String[] args) {	
		SelectionSort ob = new SelectionSort();
        int arr[] = {18,92,36,64,12};
        ob.sort(arr);
        System.out.print("Sorted array: ");
        ob.printArray(arr);

	}

}
