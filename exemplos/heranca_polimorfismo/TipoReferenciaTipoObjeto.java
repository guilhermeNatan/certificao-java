class A {
	void liga(){
		System.out.println("liga A"); 
	}

}

class B extends A {

	void liga(){
                System.out.println("liga B"); 
        }

      void desliga(){
                System.out.println("desliga b"); 
        }

}

class TesteTipoRefeTipoObj
{
	public static void main(String ...args)
	{
		A a = new B(); 
	//	a.desliga(); não compila, pois a classe A não possui o método desliga. 
		B b =  new B(); 
		b.desliga();

		A a2 = new B();
		a2.liga(); // imprime liga B , pois o método a ser chamado é definido em tempo de execução
		
	}
}
