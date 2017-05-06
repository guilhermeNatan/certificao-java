class B { 
    private String s;
    protected B() {}
    static A B(String s) {
        return new A(s);
    }
}
class A extends B {
   
// Não é necessario no construtor da classe filha invocar o construtor padrão da classe pai
      A(String s) {
        
	System.out.println(s);
    }
    public static void main(String[] args) {
       
	
	 B b = new A("Objeto Classe A");
        System.out.println("compilou");
    }
}
