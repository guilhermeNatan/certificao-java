
class  A extends Exception{}
class B extends A {}
class C extends A {}
class HerancaExceptions{

	private void split()throws B , C{} 

	public void run()
	{
		try{
			split();
		}catch(B b){

		}catch(A a)
		{

		}
	}
	public static void main(String ...args)
	
	{

	}
}
