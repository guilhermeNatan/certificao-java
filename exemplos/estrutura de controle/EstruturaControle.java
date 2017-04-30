public class EstruturaControle
{

	public static void exemplo1()
	{
		String result = "1";
		int score = 10;
		if ((score = score+10) == 100)
		result = "A";
		else if ((score = score+29) == 50)
		result = "B";
		else if ((score = score+200) == 10)
		result = "C";
		else
		result = "F";
		System.out.println(result + ":" + score);
	}
	
	public static void exemplo2()
	{
		String result = "1";
		int score = 10;
		if (++score == 11)
			result = "A";
		else if (score++ == 50)
		result = "B";
		else if (score++ == 10)
		result = "C";
		else
		result = "F";
		System.out.println(result + ":" + score);
	}
	
	
	public static void exemplo3()
	{
		String result = "1";
		int score = 10;
		if (score++ == 11)
			result = "A";
		else if (score++ == 11)
		result = "B";
		else if (score++ == 10)
		result = "C";
		else
		result = "F";
		System.out.println(result + ":" + score);
	}
	
	public static void exemplo4()
	{
		boolean teste = false; 
		
		if((teste = true) && false)
		{
			System.out.println("A");
		}
		else
		{
			System.out.println("B");
		}		
		
		if(teste)
		{
			System.out.println("C");
		}
		
	}
	public static void main(String[] args)
	{
			exemplo1(); // F:249
			exemplo2(); // A:11
			exemplo3(); // B:12
			exemplo4(); // BC
	}

}