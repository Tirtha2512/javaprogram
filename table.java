import java.util.*;
class table
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter table value=");
		int table=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(table+"*"+(i)+"="+(table*i));

		}
		
	}
}