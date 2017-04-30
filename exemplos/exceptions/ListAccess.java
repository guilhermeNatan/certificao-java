import java.util.ArrayList;
public class ListAccess {
	public static void main(String args[]) {
	ArrayList<Ink> inks = new ArrayList<Ink>();
	inks.add(new ColorInk());
	inks.add(new BlackInk());
	inks.add(new WhiteInk());
	Ink ink = (BlackInk)inks.get(2); //sucesso 
	Ink ink2 = (WhiteInk)inks.get(1);
	}
}
class Ink{}
class ColorInk extends Ink{}
class BlackInk extends Ink{}
class WhiteInk extends BlackInk {}


//  	ink
//	     |
//  CI 		BI 
//  		 |
//  		WI