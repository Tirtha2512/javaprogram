class twod_array
{
	public static void main(String args[])
	{
		int a[][]={{11,22,33},{77,52,89},{77,88,99}};
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
			System.out.print(a[i][j]+"\t");	
			}
			System.out.println();
		}
		
	}
}