class Teste{
	private int i = 6 ;
	private int j = i;

	public void Teste()
	{
		i = 5; 
	}
	public static void main(String ...ars)
	{
		Teste t = new Teste();
		System.out.println(t.i + t.j );
	}
}
