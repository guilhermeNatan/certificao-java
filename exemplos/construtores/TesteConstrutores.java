class A {

	public A(int x){

	}
}

class B extends A {
	B(){
		super(2);
	}
	
}

class TesteConstrutores {
	static int x = 10;
	public static void main(String ...args){
		System.out.println(x);
	

	}
}

class TesteConstrutores2 {
	int metodo(){return 10;} 

	public TesteConstrutores2(int x){
		System.out.println(x);
	}

	//Não compila pois não se pode chamar um método quando se invoca um construtor por meio do this
	public TesteConstrutores2(){
	//	this(metodo());
	}



}


/*
 *   É possível chamar um método dentro de um construtor ? 
 *   	Sim é possível , porém o contrário não é valido 
 *   
 *   Uma classe pai obriga a classe filha implementar um construtor caso a pai implemente um diferente do padrão? 
 *
 * */
class W {
        public W()
	{
		metodo();
					        
	}

	public void metodo()
	{
		System.out.println("metodo");
						        
	}

}


 /*  
  *  Uma classe pai obriga a classe filha implementar um 
  *  construtor caso a pai implemente um diferente do padrão? 
  *
  *  Sim, no exemplo abaixo a classe Z é obrigada a implementar um construtor
  *  Que invoque o construtodor da classe pai 
 */   
class Y{
	public Y(int x)
	{

	}
}
class Z extends Y  {
	public Z(int num1, int num2)
	{
		super(num1); 
	}
	
}

class TesteConstrutores3{


	int x , z = 0; 
	private boolean priv = true; 
	 public  static   void  main(String ...args)
	{
		W w = new W();
		TesteConstrutores3 t = new TesteConstrutores3(); 
		System.out.println(t.priv);

		System.out.println(outro);

		Boolean b = new Boolean(false); 
		Boolean c = new Boolean (false); 
		System.out.println(new Boolean(false) == false);
		System.out.println(b==c);
		System.out.println(b.equals(c));
		System.out.println(b.equals(false));
	}

	static boolean qualquer = false; 
	static boolean outro = new Boolean(false)==qualquer; 
	
}



