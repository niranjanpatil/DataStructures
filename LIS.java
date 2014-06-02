
public class LIS {
	
	public static int LIS(final String str)
	{
		int []arr= new int[str.length()];
		
		arr[0]=1;
		
		for(int i=1;i<arr.length-1;i++)
		{
			if(str.charAt(i)>=str.charAt(i-1))
			{
				arr[i]=arr[i-1]+1;
			}
			else
			{
				arr[i]=1;
			}		
		}
		
		if(str.charAt(arr.length-1)>=str.charAt(arr.length-2))
		{
			arr[arr.length-1]=arr[arr.length-2]+1;
		}
		else
		{
			arr[arr.length-1]=1;
		}
		
		System.out.println("DP Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
		int max=0;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		
		return max;
		
		
	}
	
	public static void main(String[] args) {
		
		String str="7891234";
		
		System.out.println("\nMax value of longest increasing subsequence = "+LIS(str));
		
		
	}

}
