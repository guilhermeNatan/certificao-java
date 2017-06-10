import java.util.ArrayList; 
import java.util.List; 

class TesteArrayList{

	
	 final public void  metodo(){}
	
	 public void a(int...b){}

	public void b(int[] x, int...y){}
	 //void public me(){}
	public static void main(String args[])
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
		//ArrayList<Integer> arrayList_2 = new List<Integer>();
		//
		arrayList.add(0,31);
	//	arrayList.add(3,66); //IndexOuOfBountsException 
		Integer i = Integer.valueOf(32);
		arrayList.remove(i);
		System.out.println(arrayList);
		
		int[] a = new int[] {1,2,3,4}; 
		System.out.println(a[1]);
		//System.out.println(a[6]); //ArrayIndexOutOfBountsException
		
		ArrayList<String> arl = new ArrayList<>(); 
		arl.add(0,"guilherme"); 
		arl.add(1,"natan"); 
		arl.add(2,"alecrim");

		for(int x = 0 ; x < arl.size(); x++)
		{
			arl.remove(x); 
		}

		System.out.println(arl);
		
		// Não compila
		//System.out.println("gui".charAt(4));


		ArrayList<Integer> numeros = new ArrayList<>(); 
		numeros.add(500); numeros.add(600); 

		ArrayList<Integer> numeros2 = new ArrayList<>();
		numeros2.add(500); numeros2.add(600);

		System.out.println(numeros2.equals(numeros)); // Imprime true  pq os dois arrlist tem os mesmos elementos nas mesmas posicoes
	
	}
}

