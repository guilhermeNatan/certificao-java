public class SwitchCase
{
	public static void main(String[] args)
	{
		int marks = 20;
		switch (marks) {
		case 10: 
			System.out.println(10);		
		case 20: 
			System.out.println(20);		
		case 30: 
			System.out.println(30);
		break;
		default: System.out.println("default");
				 System.out.println("default");
	
		}
		
		double x = 20;
		System.out.println(x);
		
		/* Não compila
			final int a = 10;
			final int b = 20;
			final int c ;
			c = 30;
			switch (a) {
			case b+c: System.out.println(b+c); break;
		*/
		
			// Não compila
			/*char letra = 'c';
			switch (letra) {
			case 100000: System.out.println(1); break;
			}*/

	}
}