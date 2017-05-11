/*CONSTANTES
 * 
 * Perceba que pode haver qualquer variação das palavras iniciais
 *
 * O seguinte código compila com sucesso. 
 * */
interface X {
	public static final int x = 0; 
	final static public int y = 0;
	static public final int z = 0; 
	public final static int w = 0; 

}


abstract class B {
	void x() {
	        System.out.println(y());
			    
	}

	int y() {
	        return 2;			    
	}

}
abstract class C extends B {
	 abstract int y();

}
// não compila. D é obrigada e implementar o método y, mesmo ele estando definido em B;
class D extends C {
	 

}
class A {
	public static void main(String[] args) {
	   D d  = (D) (C) new D();
	   d.x();
				    
	}

}
