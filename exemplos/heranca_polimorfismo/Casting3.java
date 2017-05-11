interface Z {}
interface W {};
interface Y extends Z, W {}
class B {}
class C extends B{}
class D extends B implements Z, W {}
class E extends C {}

class A {

	/**
	 * Compila e executa com sucesso 
	 */
	public static void main(String[] args) {
		        B b = new C();
			    
	}

}
