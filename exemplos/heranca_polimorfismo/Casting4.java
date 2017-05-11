interface Z {}
interface W {}
interface Y extends Z, W {}
class B {}
class C extends B implements Y {}
class D extends B implements Z, W {}
class E extends C {}
class A {
	public static void main(String[] args) {
			B b = new C(); //auto promoção 
			C c = (C) b; // descento na arvore de heranca generico B para o especifico C 
			
		        C ce =  (C)new B(); //não executa 
			    
	}

}
