//example to access class method
class bank
{
	double p=5000,r=12;
	int n=5;
	double simpleintrest()
	{
		return(p*r*n/100);
	}
}

class bank_demo
{
	public static void main(String[] args) 
	{
		bank b1=new bank();
		double si=b1.simpleintrest();
		System.out.println("simple intrest is:"+si);
	}
}