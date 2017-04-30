class Construtores {
	
	Construtores()
	{
		//this();
	}
	Construtores(int a , int b)
	{
		metodo2();
		System.out.println(a + " " + b);
		
	}
	
	public void metodo ()
	{
		// não é possivel chamar construtor dentro de um método 
		//this(1, 1);
	}
	
	public void metodo2()
	{
		System.out.println("teste");
	}
	
	public static void main(String[] args)
	{
		Construtores c = new Construtores(1,2);
		
	}

}