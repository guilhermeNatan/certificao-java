class A {

	public A(int x){

	}
}

class B extends A {
	B(){
		super(2);
	}
	
}

class TesteConstrutores {
	static int x = 10;
	public static void main(String ...args){
		System.out.println(x);
	

	}
}

class TesteConstrutores2 {
	int metodo(){return 10;} 

	public TesteConstrutores2(int x){
		System.out.println(x);
	}

	//Não compila pois não se pode chamar um método quando se invoca um construtor por meio do this
	public TesteConstrutores2(){
	//	this(metodo());
	}



}

