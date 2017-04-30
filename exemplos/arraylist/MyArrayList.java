import java.util.ArrayList;
public class MyArrayList{

	public static void imprimeArrayList(ArrayList<String> array)
	{
		for (String i : array)
			System.out.println(i);
	}
	public static void imprimeArray(StringBuilder[] arrayString){
	for(int i = 0 ; i < arrayString.length ; i++)
		{
			System.out.println(arrayString[i]);
		}
	}
	public static void imprimeArrayListStringBuilder(ArrayList<StringBuilder> array)
	{
		for (StringBuilder i : array)
			System.out.println(i);
	}
	public static void main(String[] args)
	{
		ArrayList<String> myArrList = new ArrayList<String>();
		myArrList.add("One");
		myArrList.add("Two");
		ArrayList<String> yourArrList = new ArrayList<String>();
		yourArrList.add("Three");
		yourArrList.add("Four");
		myArrList.addAll(1, yourArrList);
		//imprimeArrayList(myArrList);  // one three four two 
			
		System.out.println("Remoção");
		yourArrList.remove(0); 
		System.out.println("yourArrList");
		imprimeArrayList(yourArrList);   //Four
		System.out.println("myArrList");
		imprimeArrayList(myArrList);  //  one three four two 
		
		System.out.println("Alteração");
		yourArrList.set(0, "Eu alterei um objeto");
		System.out.println("yourArrList");
		imprimeArrayList(yourArrList);  // Eu alterei um objeto
			System.out.println("myArrList");
		imprimeArrayList(myArrList);  // one three four two 
		
		// obsr: eu criei as duas listas usando o operador new ou seja 
		// o que aconteceter  em uma não refleterá na outra
		
		
		ArrayList<String> listaA = new ArrayList<String>();
		listaA.add(new String("One"));
		listaA.add(new String("Two"));
		ArrayList<String> listaB = listaA; 
		listaB.add("Three");
		listaB.add("Four");
		
		listaB.set(0,"Elemento pos 0 alterado");
		System.out.println("Lista A");
		imprimeArrayList(listaA);
		System.out.println("Lista B");
		imprimeArrayList(listaB);
		
		System.out.println("---------------");
		ArrayList<StringBuilder> listaX = new ArrayList<StringBuilder>();
		listaX.add(new StringBuilder("One"));
		listaX.add(new StringBuilder("Two"));
		
		
		
		StringBuilder[] arrayString = new StringBuilder[listaX.size()];
		arrayString = listaX.toArray(arrayString);
		
		imprimeArray(arrayString); 		// one two 
		System.out.println("---------------");
		arrayString[0].append("teste");
		imprimeArray(arrayString);  // oneteste two 
		System.out.println("//Fim array");
		imprimeArrayListStringBuilder(listaX); // oneteste two 
		// o metodo toArray mantem a referencia dos objetos individuais dos mesmos objetos da lista
		// quando estes são objetos mutaveis 
	}
	
	

}

