class A {
	static void metodo()
	{
		System.out.println("metodoA"); 
	}

	void metodoDeInstancia()
	{
		System.out.println("metodo de instancia A");
		
		//Dentro de um método de instacia vc pode acessar consteúdo estatico
		//usando o this. 
		this.metodo();
	}

	static void metodoEstatico()
	{
		// Não compila pois dentro de um constexto estatico vc não pode usar o this. 
		//this.metodo();
	}

}

class B extends A {
	        static void metodo()
		{
		   System.out.println("metodoB");
					        
		}

}

class C {
	
	static int x = 500000;
	static {
		System.out.println("Dentro do Bloco Estatico"); 
	}
	{
		int x = 0; 
		System.out.println(x+23); 
		System.out.println(C.x); 
	}

	C()
	{
		System.out.println("Dentro do construtor");
	}

}
class TesteMetodosEstaticos {
	public static final int xxx = 10; 

	public static void main(String ...args)
	{
		new A().metodo();
		new B().metodo();
		new A().metodoDeInstancia();
		new A().metodoEstatico();	
		new C(); 
	}

}
