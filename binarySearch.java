
public class binarySearch {
	
	public static int binarySearchNonRecursive(int []arr,int number)
	{
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			if(arr[mid]==number)
				return mid;
			else if(arr[mid]>number)
				high=mid-1;
			else
				low = mid+1;
		}
		
		return -1;
			
	}
	
	public static int binarySearchRecursive(int []arr, int start, int end, int number)
	{
		if(start<=end)
		{
			int mid=(start+end)/2;
			
			if(arr[mid]==number)
				return mid;
			else
				if(arr[mid]>number)
				return(binarySearchRecursive(arr, start, mid-1, number));
				else
					return(binarySearchRecursive(arr, mid+1, end, number));
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int []arr= {2,8,4,12,1,5,17,19};
		
		int bSearch = binarySearchNonRecursive(arr, 19);
		
		if(bSearch<0)
			System.out.println("Number cannot be found");
		else
			System.out.println("Number found in the array at location: "+bSearch);
		
		bSearch = binarySearchRecursive(arr, 0, arr.length-1, 2);
		
		if(bSearch<0)
			System.out.println("Number cannot be found");
		else
			System.out.println("Number found in the array at location: "+bSearch);
			
	}

}
