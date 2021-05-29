import java.util.*;
public class MinMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the test cases");// Enter the number of test cases
		int t=sc.nextInt();
		System.out.println("enter the number of elements");
		for(int a=0;a<t;a++)
		{
			int n=sc.nextInt();
			int ar[]=new int[n];
			for(int i=0;i<n;i++)
			{
				ar[i]=sc.nextInt();//Enter the number of elements
			}
			
			Arrays.sort(ar);                //sorting array
			System.out.println(ar[0]*(n-1));//Basic logic is multiplying first element and last
			
		}
	}

}
