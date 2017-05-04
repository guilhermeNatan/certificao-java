interface Roamable {}
interface OutraInterface{}
class NadaAve{}
class Phone{}
class Tablet extends Phone implements Roamable {
	public static void main(String ...args)
	{
		//Roamable var = (Roamable) new Phone();
		NadaAve nda = (NadaAve) new Phone(); 
		//OutraInterface outra = (OutraInterface) new Phone();
	}


}
