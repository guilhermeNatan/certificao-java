
public class ComparacaoString {

	
	public static void main(String[] args)
	{
		String morning1 = "Morning";
		System.out.println("Morning" == morning1);// true pq compara objetos que estão no pool de string
		
		String morning2 = new String("Morning");
		System.out.println("Morning" == morning2); // false pq compara um objeto que não esta no pool com um que esta
		
		
		String abacaxi = "abacaxi"; 
		String banana = new String("banana"); 
		
		abacaxi = banana; 
		System.out.println(abacaxi);  // imprime banana 
		
		String name = new String("Paul");
		System.out.println(name.charAt(0)); // P
		System.out.println(name.charAt(2)); // u
		//System.out.println(name.charAt('P')); // compila mas index of exception pq o valor de 'P' é 80 em ASCII 
		//System.out.println(name.charAt(4)); // exceção 
		
		
		String letters = "ABCAB";
		System.out.println(letters.indexOf('B')); //1 
		System.out.println(letters.indexOf("S")); // -1
		System.out.println(letters.indexOf("CA")); // 2
		System.out.println(letters.indexOf("CB")); // -1		
		System.out.println(letters.indexOf('B', 2)); // 4, o segundo parâmetro seta a posição do  inicio da busca
		
		
		String exam = "Oracle";
		String sub = exam.substring(2); 
		System.out.println(sub); // acle
		String result = exam.substring(2, 4); // não inclui o carcater final 
		System.out.println(result); // ac  // tamanho = final - inicial 
		System.out.println(exam.substring(0, 1));
		
		String varWithSpaces = " AB CB ";
		System.out.print(":");
		System.out.print(varWithSpaces.trim());
		System.out.print(":"); // :AB CB:
		
	
		System.out.println(letters.replace('B', 'b')); // AbCAb
		System.out.println(letters.replace("CA", "12")); // AB12B
		System.out.println(letters.replace("XX", "12")); // ABCAB
		
		
		
		String lang1 = "Java";
		String lang2 = "JaScala";
		String returnValue1 = lang1.substring(0,1);
		String returnValue2 = lang2.substring(0,1);
		System.out.println(returnValue1);
		System.out.println(returnValue1);
		System.out.println(returnValue1 == returnValue2);
		System.out.println(returnValue1.equals(returnValue2));
	}

}