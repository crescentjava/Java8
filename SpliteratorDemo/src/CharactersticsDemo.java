import java.util.ArrayList;
import java.util.Spliterator;
//to verify the characteristics of Spliterator obtained for ArrayList.
public class CharactersticsDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
        
		Spliterator<String> spliterator = list.spliterator();
		System.out.println(Spliterator.ORDERED );
		System.out.println(Spliterator.SIZED);
		System.out.println(Spliterator.SUBSIZED);
		int expected = Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED;
		//System.out.println(expected);
		 
		System.out.println(spliterator.characteristics() == expected);  //true
		 
		if (spliterator.hasCharacteristics(Spliterator.ORDERED)) {
		    System.out.println("ORDERED");
		}
		 
		if (spliterator.hasCharacteristics(Spliterator.DISTINCT)) {
		    System.out.println("DISTINCT");
		}
		 
		if (spliterator.hasCharacteristics(Spliterator.SORTED)) {
		    System.out.println("SORTED");
		}
		 
		if (spliterator.hasCharacteristics(Spliterator.SIZED)) {
		    System.out.println("SIZED");
		}
		 
		if (spliterator.hasCharacteristics(Spliterator.CONCURRENT)) {
		    System.out.println("CONCURRENT");
		}
		 
		if (spliterator.hasCharacteristics(Spliterator.IMMUTABLE)) {
		    System.out.println("IMMUTABLE");
		}
		 
		if (spliterator.hasCharacteristics(Spliterator.NONNULL)) {
		    System.out.println("NONNULL");
		}
		 
		if (spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
		    System.out.println("SUBSIZED");
		}
	}

}
