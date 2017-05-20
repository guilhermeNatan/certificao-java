class TesteWrappers {

	public static void main(String[] args)
	{
		int a = Integer.parseInt("10",2); 
		long b = Long.parseLong("20"); 
		Integer c = Integer.valueOf(30);
		Integer d = Integer.valueOf("40");
		Integer e = new Integer(2); 
		Integer f = new Integer("44"); 
		int g = e.intValue();
		short h = e.shortValue(); 
	

		Integer x = 128; 
		Integer z = 128;

		System.out.println(x==z);
	}
}
