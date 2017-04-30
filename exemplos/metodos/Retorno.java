class Retorno{
	public static int metodoQualquer ()
	{
		byte meuByte = 0B1101; 
		// isso é possivel pq byte é menor que int 
		return meuByte;
	}
	
	public static int metodoQualquer_2 ()
	{
		long meuLong = 102020L; 
		// só é possivel se fizer um casting explicito
		return (int)meuLong;
	}
	
	public static void main(String[] args)
	{	
		System.out.println(metodoQualquer());
		System.out.println(metodoQualquer_2());
	}
}