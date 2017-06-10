class B {
	B()
	{
		System.out.println("Dentro de b"); 
	}
}

class A extends B{

	/*A(String ...args)
	{
		System.out.println("construtor vargs"); 
	}
	*/

	//Por padrão é feita uma chamada ao construtor padrão da classe mãe 
	A(String x)
	{
		// É como se exitisse um super(); nessa linha
		System.out.println("construtor uma string");
	}
	A(String a, String b)
	{
		// É como se exitisse um super(); nessa linha
		 System.out.println("construtor duas strings");
	}
}


class TesteConstrutor2 {
	public static void main(String ...args)
	{
		A a = new A("guilhere");
		A b = new A("guilherme", "natan");
	//	A c = new A("guilherme", "natan", "Alecrim");
	//	A d = new A();
	}
}
