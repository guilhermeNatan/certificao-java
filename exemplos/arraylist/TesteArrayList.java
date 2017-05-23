import java.util.ArrayList; 
import java.util.List; 

class TesteArrayList{


	public static void main(String args[])
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
		//ArrayList<Integer> arrayList_2 = new List<Integer>();
		//
		arrayList.add(0,31);
		arrayList.add(3,66); //IndexOuOfBountsException 
		Integer i = Integer.valueOf(32);
		arrayList.remove(i);
		System.out.println(arrayList);
		
		int[] a = new int[] {1,2,3,4}; 
		System.out.println(a[1]);
		//System.out.println(a[6]); //ArrayIndexOutOfBountsException
	
	}
}

