import java.util.ArrayList;
public class Invalid {
	public static void main(String args[]) {
	ArrayList<ColorInk> inks = new ArrayList<ColorInk>();
	inks.add(new ColorInk());
	Ink ink = (BlackInk)inks.get(0);
	}
}
class Ink{}
class ColorInk extends Ink{}
class BlackInk extends Ink{}

// Não compila pois é possível definir o tipo de inks.get(0) em tempo 
// de compilação, já que o ArrayList inks foi definido para o tipo ColorInk 