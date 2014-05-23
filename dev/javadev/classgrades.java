abstract class classgrades
{
	abstract void class1student1();
	abstract void class2student1();
	abstract void class3student1();
}

class grade extends classgrades
{
	void class1student1()
	{
		System.out.println("You made a 96% on your first class!"); //this literally isn't going to work i just hope you know that and I hope you accept my apology
	}
	void class2student1()
	{
		System.out.println("You made a 91% on your second class!");
	}
	void class3student1()
	{
		System.out.println("You made a 60% on your third class :(");
	}
}

abstract class classgrades1

{
	abstract void class1student2();
	abstract void class2student2();
	abstract void class3student2();
}

abstract class grade1 extends classgrades
{
	void class1student2()
	{
		System.out.println("You made a 12% on your first class!");
	}
	void class2student2()
	{
		System.out.println("You made a 67% on your second class!");
	}
	void class3student2()
	{
		System.out.println("You made a 12% on your third class :(");
	}
}
