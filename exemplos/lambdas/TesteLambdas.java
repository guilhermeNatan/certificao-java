import java.util.List;
import java.util.ArrayList;

interface Filtro {
	void imprime(String a); 
}

interface FiltroDeRemocao<T> {
	boolean remove(T elemento);  
}

interface Map<T> {
	T[] map(T e[]); 
}
class TesteLambdas{

	public static void usandoFiltro(Filtro filtro)
	{
		filtro.imprime("casa"); 
	}



	public static void removendoElementos()
	{

		List<String> nomes = new ArrayList<>(); 
		nomes.add("Guilherme"); 
		nomes.add("Andre"); 
		
		FiltroDeRemocao<String> filtroRemocao = null; 
		filtroRemocao = e -> e.startsWith("A"); 
		
	for(int i=0 ;i<nomes.size(); i++)
	{
		if(filtroRemocao.remove(nomes.get(i)))
		{
			nomes.remove(i);
		}
	}

	System.out.println(nomes);
	
	}

	public static void teste(){
		System.out.println("teste"); 
	}


	public static void mapArray ()
	{
		
		Map<Integer> imprimeArray = (Integer a[]) ->{

			   for(int i =0;i<a.length;i++)
			   {
			      System.out.println(a[i]);
								                           
			   }

			   return a; 

		};


		Map<Integer> mp = (a) ->{
			for(int i =0 ; i<a.length;i++)
			{
				a[i] *= 2; 
			}

			imprimeArray.map(a); 

			return a;
		};

		Integer[] x = {1,2,3,4}; 

		mp.map(x);
	}
	public static void main(String ...args){

		
		Filtro f = x -> {
					System.out.println(x);
					System.out.println(x.length());
				};

		usandoFiltro(f);
		removendoElementos();

		mapArray();



		
	}

}
