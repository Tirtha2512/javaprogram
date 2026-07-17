class car
{
	int modelyear;
	String modelname;
	car()
	{
		System.out.println("my car name is audi");
	}
	car(int year,String name)
	{
		modelyear=year;
		modelname=name;
	}

}

class overload_construct
{
	 public static void main(String[] args)
	 {
		car c1=new car();
		car c2=new car(2024,"audi A4");
		System.out.println("modelyear:"+c2.modelyear+"and modelname:"+c2.modelname);
	}
}