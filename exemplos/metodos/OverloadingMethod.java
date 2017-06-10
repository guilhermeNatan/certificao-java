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
	

	// erro de ambiguidade se passar um int int 
	int teste(int a , double b){return 0;}
	int teste(double b, int a){return 0;}
	

	void  teste_2(double a, double b) {System.out.println("t2 double");}
	//void  teste_2(int a, int  b) {System.out.println("t2 int ");}
	void  teste_2(float a, float b) {System.out.println("t2 float");}
	void  teste_2(int a , float b){System.out.println("t2 int float");}
	public static void main(String[] args)
	{
		//new OverloadingMethod().teste(Integer.valueOf(args[0]),Integer.valueOf(1));
		new OverloadingMethod().teste_2(1,2.0); // t2 double
		new OverloadingMethod().teste_2(1,3.0F); // t2 float
		new OverloadingMethod().teste_2(2.0F,3.0D);// t2 double
		new OverloadingMethod().teste_2(2,2);// int float
	}

}
