class A {
	/*Não compila pq expressão lambda não consegue acessar variveis extenasque não são final ou efetivamente final*/
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			               // new Thread(() -> System.out.println(i)).start();
					            
		}
		        
	}
	    
}

class Divisao {
	public static void main(String ...ars){
		
		
		Integer x =(Integer) 3/5;

		System.out.println(x);
	}
}

class Teste{
	static String tiger = "Tiger";
	static String lion = "Lion";
	static final String statement = 250 >338 ? lion :( tiger = "is Bigger");
	// statement = tiger = "is Bigger"
	public static void main(String ...ars)
	{
		String a = "A"; 
		String b = "b";
		final String c =  b = "casa"; 

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(statement);

		   StringBuilder s = new StringBuilder("casa");
		           s.deleteCharAt(1);
			           System.out.println(s);
		double x = 4.;
		System.out.println("x =" + x);

		Character z = new Character('M');
		StringBuilder w = new StringBuilder(z);
	}
}
