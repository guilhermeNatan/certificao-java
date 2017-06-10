class TesteRetorno{
	public static void main(String ...args)
	{
		a(5);

	}

	// StackOverflowError quando l<10
	static int a(int l) {
		        if(l<10) return b(l); //A
			        else return c(); // B
				    
	}
	static int b(int l) {
		        if(l<10) return b(l); // C
			        else return c(); // D
				    
	}
	static int c() {
		        return 3;
			    
	}
}
