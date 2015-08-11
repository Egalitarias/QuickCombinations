import java.util.HashSet;
import java.util.Set;


public class TestQuickPermutations {
	
	public static void TestString1() {
		QuickPermutations<String> permutations = new QuickPermutations<String>();
		
		permutations.reset(null);
		int index = 0;
		while(permutations.hasNext()) {
			System.out.println("permutation: " + index + " " + permutations.next());
			++index;
		}
	}

	public static void TestString2() {
		QuickPermutations<String> permutations = new QuickPermutations<String>();
		
		Set<String> items = new HashSet<String>();
		items.add("Green");
		items.add("Red");
		items.add("Blue");
		permutations.reset(items);
		int index = 0;
		while(permutations.hasNext()) {
			System.out.println("permutation: " + index + " " + permutations.next());
			++index;
		}
	}

}
