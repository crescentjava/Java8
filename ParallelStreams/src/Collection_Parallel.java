import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Collection_Parallel {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("ones","two","three","four");
		
		Predicate<String> p1 = s -> s.length() > 3 ;
		Stream<String> stream = list.parallelStream();
		
		stream
		     .filter(p1)
		     .forEach(System.out::println);
	}
	
	

}
/*
parallel streams are more appropriate for operations where the order of processing doesn't matter and 
the operations don't need to keep a state
(stateless and independent operations).
 */