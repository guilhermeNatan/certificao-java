interface Veiculo {
    int getMarcha();
//    void liga();
}

/* Uma classe abstra não é obrigada  a implementar os métodos de uma interface 
 porém as classes que implementa a classe abstrata devem implementar os mentos de interface
 que não foram implementados na classe abstrata*/
abstract class Carro implements Veiculo {

	
}

class CarroConcreto extends Carro {

// obrigado a implementar os metodos da interface

	public int  getMarcha(){

	System.out.println("1");
	return 0;
	}
}


class TesteSobrescrita {
	public static void main(String ...args){
		new CarroConcreto().getMarcha();
	}

}
