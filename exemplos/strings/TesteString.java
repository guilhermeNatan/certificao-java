class TesteString {

	public static void main(String ...args)
	{
		String a = "casa"; 
		a+="1"; 
		System.out.println("casa1" == a); // false pq usou + 

		String b = "lobo"; 
		String c = "cachorro"; 
		String d = b + c ; 
		System.out.println("lobocachorro" == d); // false pq usou + 
		System.out.println(b.concat(c)=="lobocachorro"); // false
		
	}
}
