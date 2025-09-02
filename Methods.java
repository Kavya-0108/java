package day2;
public class Methods {
	static void Method()//No parameter and No return value
	{
		System.out.println("No parameter and No return value");
	}
	static void Method1(int n)//parameter without return value method
	{
		System.out.println("parameter and No return value "+n);
	}
	static int Method2()//No parameter and return value
	{
		System.out.println("No parameter and return value");
		return 10;
	}
	static int Method3(int n)
	{
		System.out.println("parameter and return value "+n);
		return 10;
	}
	public static void main(String[] args) {
		Method();
		Method1(5);
		Method2();
		Method3(25);
	}

}
