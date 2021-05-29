import java.util.*;
public class MinMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the test cases");
		int t=sc.nextInt();
		System.out.println("enter the number of elements");
		for(int a=0;a<t;a++)
		{
			int n=sc.nextInt();
			int ar[]=new int[n];
			for(int i=0;i<n;i++)
			{
				ar[i]=sc.nextInt();
			}
			
			Arrays.sort(ar);
			System.out.println(ar[0]*(n-1));
			
		}
	}

}
