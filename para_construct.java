class fruits
{
	String fruite_nm;
	fruits(String f_nm)
	{
		fruite_nm=f_nm;
	}
}

class para_construct
{
	public static void main(String[] args)
	{
		fruits f1=new fruits("mango");
		System.out.println("fruite name:"+f1.fruite_nm);
	}
}