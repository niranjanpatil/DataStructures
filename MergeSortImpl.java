
public class MergeSortImpl {
	
	public static int[] mergeSort(int []arr, int p, int r)
	{
		
		if(p<r)
		{
			int q= (p+r)/2;
			
			mergeSort(arr, p, q);
			mergeSort(arr, q+1, r);
			merge(arr,p,q,r);
		}
		
		return arr;
		
	}
	
	
	private static void merge(int[] arr, int p, int q, int r) {
		
		int n1= q-p+1;
		int n2= r-q;
		
		int []arr1 = new int[n1];
		int []arr2 = new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			arr1[i]=arr[p+i];		
		}
		
		for(int j=0;j<n2;j++)
		{
			arr2[j]=arr[q+1+j];		
		}
		
		int i=0;
		int j=0;
		int k=p;
		
		while(i<n1 && j<n2)
		{
			if(arr1[i]<=arr2[j])
			{
				arr[k]=arr1[i];
				i++;
				k++;
			}
			else
			{
				arr[k]=arr2[j];
				j++;
				k++;			
			}
		}
		
		while(i<n1)
		{
			arr[k]= arr1[i];
			i++;
			k++;
		}
		
		while(j<n2)
		{
			arr[k]=arr2[j];
			j++;
			k++;
		}
		
	}


	public static void display(int []arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		
		int []arr= {10,2,15,4,66,77,11};
		
		System.out.println("Orignal array before merge sort");
		
		display(arr);
		
		arr=mergeSort(arr, 0, arr.length-1);
		
		System.out.println("\nArray after merge sort");
		
		display(arr);
	}
	

}
