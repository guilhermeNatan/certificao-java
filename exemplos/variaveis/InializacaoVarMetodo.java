 class InicialiacacaoErroCompilacao {
	
	public static void escopoVar()
	{
		/*
		 * Não pode ter uma variavel com mesmo nome da variavel usada no for 
		 * antes do looping e nem depois do looping*/
		//int i =0; 
		for(int i =0;i<5;i++)
		{
			System.out.println(i);
		}

		//System.out.println(i);
	

	}

	
	public static void test()
	{
		char letra = 'c';
		do
		{
			System.out.print(letra++);
			System.out.println("proxima" + letra);
		}
		while(letra <='f'); 
	}

    	public static void main(String... args)
	{
		// Códico não irá compila pois toda várivel dentro de método tem que ser inicializada
		// A variavel pode não ser inicializada, porém ela também não pode ser usada . 

		String varNaoInicializada; 
		char price; 

		//System.out.println(varNaoInicializada); 
		//System.out.println(price);
	

		test();
	}
	
}

