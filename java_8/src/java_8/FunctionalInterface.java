package java_8;

interface i
{
	public void m1();

	default void  m2() 
	{
		System.out.println("default_i_m2");
	}
	default void m3()
	{
		System.out.println("default_i_m3");
	}

	public static void m4()
	{
		System.out.println("static_i_m4");	
	}
	public static void m5()
	{
		System.out.println("static_i_m5");
	}
}
public class FunctionalInterface implements i{

	@Override
	public void m1()
	{
		System.out.println("i_m1");	
	}

	public static void main(String[] args) {

		// for static interface method no need create object of class
		i.m4();
		i.m5();

		// for abstrace method we have to implement interface to class 
		// for default method we have to implement interface to class
		i ia= new FunctionalInterface();
		ia.m1();
		ia.m2();
		ia.m3();
	}


}
