interface Teste_1{
	/*
	 * Por padrão váriaveis de uma interface são public static e final 
	 */
	int x = 10 ; 


	int x();
	// métodos estáticos não são herdados
	// para acessa-los é necessário usar o nome da interface como referencia
	static void metodoEstatico()
	{
		System.out.println("Dentro do método estatico");
	}

	public default int meuNome()
	{
		System.out.println("Meu nome Teste_1");
		return 0;
	}
}

interface Teste_2 {
	int x =40 ; 
	public default int meuNome()
	{
		System.out.println("Meu nome Teste_2");
		return 0;	        
	}

	
	/*O uso das palavras public e abstract na declaração de métodos das 
	 * interfaces são OPCIONAIS 
	 * */
	abstract void y();

	public void z();

}


class TesteJava implements Teste_1, Teste_2{

	/*
	 * Sou obrigado a implementar o método meuNome, pois ele 
	 * é definido nas duas interfaces. 
	 *
	 * PERCEBA QUE SOU OBRIGADO A USAR COMO MODIFICADOR DE ACESSO A PALAVRA PUBLIC 
	 *  
	 */
	public int meuNome()
	{
		System.out.println("TesteJava"); 
		return 0;
	}
	
	public int  x()
	{
		return 0;
	}
	public static void main(String ...args){
		Teste_1 t = new TesteJava(); 
		
		Teste_1.metodoEstatico();

	}
	public void z(){}
	public void y(){}


}

