import java.util.ArrayList;
import java.util.Spliterator;

//to perform hasNext() and next() operations in single statement using forEachRemaining() method.
public class ForEachRemainingDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
        
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		 
		Spliterator<String> spliterator = list.spliterator();
		 
		spliterator.forEachRemaining(System.out::println);

	}

}
