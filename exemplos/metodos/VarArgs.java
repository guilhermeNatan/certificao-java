public class VarArgs {

	public static int metodo(String x, int...days)
	{
	int daysOff = 0;
	for (int i = 0; i < days.length; i++)
		daysOff += days[i];
	return daysOff;
	}
	

	//compila com sucesso
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4};
		
		//posso passar tanto um array quanto vários inteiros separados 
		//por vírgula quando uso varargs 
		System.out.println(metodo("a",array));
		System.out.println(metodo("a",1,2,3,4));
		setQualquerCoisa(2);
	}
}
