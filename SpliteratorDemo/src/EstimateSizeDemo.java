import java.util.ArrayList;
import java.util.Spliterator;

public class EstimateSizeDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
        
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		 
		Spliterator<String> spliterator = list.spliterator();
		 
		System.out.println(spliterator.estimateSize());
		System.out.println(spliterator.getExactSizeIfKnown());

	}

}
