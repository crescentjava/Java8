import java.util.Arrays;
import java.util.List;

public class NestedFor {
	
	public static void printAllPermutationsForLoops(List<Integer> list1, List<Integer> list2, List<Integer> list3) {
        for (Integer int1 : list1) {
            for (Integer int2 : list2) {
                for (Integer int3 : list3) {
                    System.out.println(int1 + ", " + int2 + ", " + int3);
                }
            }
        }
    }
	
	
	  public static void printAllPermutationsLambda(List<Integer> list1, List<Integer> list2, List<Integer> list3) {
	        list1.forEach(int1 -> {
	        	System.out.println("First");
	            list2.forEach(int2 -> {
	            	System.out.println("Second");
	               list3.forEach(int3 -> {
	            	   System.out.println("Third");
	                   System.out.println(int1 + ", " + int2 + ", " + int3);
	               }); 
	            });
	        });
	    }
	  
	  public static void printAllPermutationsLambda2(List<Integer> list1, List<Integer> list2) {
	        list1.forEach(int1 -> {
	        	System.out.println("First");
	            list2.forEach(int2 -> {
	            	System.out.println("Second");
	              
	                   System.out.println(int1 + ", " + int2 );
	               }); 
	           
	        });
	    }

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2,3);
		List<Integer> list2=Arrays.asList(5,6);
		List<Integer> list3=Arrays.asList(8);
		
		System.out.println("Permutations using for loop");
		printAllPermutationsForLoops(list1, list2, list3);
		
		System.out.println("Permutations using Lambda");
		printAllPermutationsLambda(list1, list2, list3);
		
		System.out.println("Permutations using Lambda2");
		printAllPermutationsLambda2(list1, list2);

	}

}
