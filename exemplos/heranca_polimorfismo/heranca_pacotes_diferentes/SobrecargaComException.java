class Veiculo {
	public void liga() throws java.io.IOException 

	{
		System.out.println("Liga Veiculos"); 
	}

	public void anda() throws IndexOutOfBoundsException
	{
		System.out.println("anda veiculo");
	}

}

class Helicoptero extends Veiculo {

	
	public void liga()
	{
		System.out.println("Liga helicoptero");
	}

	public void anda() throws StringIndexOutOfBoundsException 
	{
	          System.out.println("anda helicoptero");
					          
	}

	
}

class SobrecargaComException
{
	/* obs: O compilador me obriga a anotar o método main com IOException, 
	por que em tempo de compilação , o compilador irá considerar o método 
	liga da classe veiculo. Porem em execução o método a ser invocado 
	é o método liga da classe Helicoptero 

	
	*/
	public static void main(String ...args) throws java.io.IOException {
	Veiculo v = new Helicoptero(); 
	v.liga();
	v.anda();
	}
}
