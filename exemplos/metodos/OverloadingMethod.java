public class OverloadingMethod {

	public static int metodo( int...days)	{return 0;}
	// sobrecarga com varargs não pode ser feita mudando apenas para um array de mesmo tipo
	//public static int metodo( int []days){}
	
	public static int metodoDois(int a)	{ return 0;}
	// acrescentando paramentros
	public static int metodoDois(int a, int b)	{return 0;}
	//mudando os tipos de parametros 
	public static int metodoDois(char x, char y)	{return 0;}	
	public static int metodoDois(int x, char y)	{return 0;}
	//mudando posição de parametros
	public static int metodoDois(char x, int y)	{return 0;}

	// NÃO IRÁ FUNCIONAR 
	// mundando somente o retorno
	//public static char metodoDois(int a)	{}
	//mudando somente o modificador de acesso 	
	//private static int metodoDois(int a)	{}
	// mundando retorno e modificador de acesso 
	//private static char metodoDois(int a)	{}
	
	
	public static void main(String[] args)
	{
	}

}
