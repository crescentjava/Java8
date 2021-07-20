import java.util.stream.Stream;

public class ParallelExe {

	public static void main(String[] args) {
		Stream.of("a","b","c","d","e")
	    .forEach(System.out::print);
		
		System.out.println();
		
		Stream.of("a","b","c","d","e")
	    .parallel()
	    .forEach(System.out::print);



	}

}
