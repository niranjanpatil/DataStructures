
public class Denominations {

	public static int findDenominations(int n)
	{
		int []arr = new int[n+1];
		
		arr[0]=0;
		arr[1]=1;
		
		for(int i=2;i<arr.length;i++)
		{
			if(i<5 && i<2)
				arr[i]=arr[i-1]+1;
			else if(i<5)
				arr[i]=Math.min(arr[i-1], arr[i-2])+1;
			else
			{
				arr[i]=Math.min(arr[i-1],arr[i-2]);
				arr[i]=Math.min(arr[i], arr[i-5])+1;
			}
		
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
		return arr[arr.length-1];
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("\n The minumum no of coins required= "+findDenominations(18));
		
	}
	
}
