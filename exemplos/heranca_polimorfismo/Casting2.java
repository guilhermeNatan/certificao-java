class Pai {}
class Filho extends Pai {}

class Teste {
	public static void main(String ...args){
		//Pai recebe filho 
		Pai pai  = new Filho(); 
		
		// ok   
		Pai pai2 = (Pai)new Filho();

		// Não compila
		//Filho filho = new Pai(); 

		Filho filho = (Filho)new Pai();
	}
}
