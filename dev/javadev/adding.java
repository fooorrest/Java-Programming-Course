class adding
{
	void Add(int a, int b);
	{
		System.out.println(a+b);
	}
	void Add(double a, double b)
	{
		System.out.println(a+b);
	}
}
class fluff
{
	public static void main(String args[])
	{
		adding obj= new adding();
		obj.Add(12,4);
		obj.Add(22.4,44.6);
	}
}