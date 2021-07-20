import java.util.ArrayList;
import java.util.Spliterator;

public class TrySplitDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
        
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		 
	//to split the elements to two groups and iterate independently.
		Spliterator<String> spliterator1 = list.spliterator();
		Spliterator<String> spliterator2 = spliterator1.trySplit();
		 
		spliterator1.forEachRemaining(System.out::println);
		 
		System.out.println("========");
		 
		spliterator2.forEachRemaining(System.out::println);

	}

}
