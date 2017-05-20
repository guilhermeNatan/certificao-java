class Teste{
	public static void xxxx()
	{
		int x;
		String z; 

//		System.out.println(z);
	}
	
	public static void main(String ...args)
	{
		int x = 11;
		switch(x){
			
			default :System.out.println("100"); 
			case 10:System.out.println("10"); 
			case 15:System.out.println("15");

		}
		
		for(int i = 0 ; i < 10 ;i++)
		{
			System.out.print(i); 
		}
		System.out.println(" ");
		for(int i = 0 ; i < 10 ; ++i)
		{
			System.out.print(i);
		}
		//xxxx();
		
		String w; 
		int z = 10;
		if(z==10)
		{
			w ="casa"; 
		}
		else
		{
		//	w ="macaco";
		}
		//System.out.println(w);
		//

		String nome = "guilherme"; 
		if(args[0].equals("1"))
		{
			 nome = "Casa";
			 System.out.println(nome);
		}
		
		nome = "guilherme";
		switch(nome){
			case "guilherme": System.out.println("------"); 
			default :System.out.println("Não funcionou");
		}
	}
}
