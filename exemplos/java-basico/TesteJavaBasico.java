class TesteJavaBasico 
{
	static {
		System.out.println("bloco statico");

	}
	{
		System.out.println("bloco NÃO estatico"); 
	}

	TesteJavaBasico()
	{
		System.out.println("construtor"); 				
	}

	public static void main(String ...nomeQualquer)
	{
		//System.out.println("Antes de criar o objeto"); 
		TesteJavaBasico t = new TesteJavaBasico(); 
		//System.out.println("Depois de criar o objeto");

		new TesteJavaBasico();
		int a= a + 1;

	}

}
