class TwistInTaleLLogicalOperators {
		public static void main (String args[]) {
		int a = 10;
		int b = 20;
		int c = 40;
		// a = 10 b = 21
		System.out.println(a++ > 10 || ++b < 30); // F || V = V
		System.out.println(a);
		System.out.println(b);
		// a = 11 b = 21
		System.out.println(a > 90 && ++b < 30); //  F && V  = F 
		// a = 11 b = 21 c = 40 		
		System.out.println(!(c>20) && a==10 ); // F && F  = F 
		// a = 11 b = 21 c = 40 		
		System.out.println(a >= 99 || a <= 33 && b == 10); // F || V && F = F 
		System.out.println(b);
		System.out.println(a >= 99 && a <= 33 || b == 10);  // F && V || F = F		
		System.out.println(a >= 99 && a <= 33 || b == 21); // F && V || V  = V
		System.out.println(false && true || true); 		
		System.out.println(true || false && false); 	
		System.out.println(true && true && false); 	
		
		Boolean z = false; 
		Boolean w = false; 
		System.out.println(z == w);


		Boolean x = new Boolean(false); 
		Boolean y = new Boolean(false); 
		System.out.println(x == y);		
		
		
		
	}
}
// Operações lógicas em java sempre são feitas da esquerda para a direita por questões 
// de otimização do compilador   