
import java.util.Set;
import java.util.HashSet;

public class TestQuickCombinations {

	public static void TestString1() {
		QuickCombinations<String> combinations = new QuickCombinations<String>();
		
		combinations.reset(null);
		while(combinations.hasNext()) {
			System.out.println("Combination: " + combinations.next());
		}
	}

	public static void TestString2() {
		QuickCombinations<String> combinations = new QuickCombinations<String>();
		
		Set<String> items = new HashSet<String>();
		items.add("Green");
		items.add("Red");
		items.add("Blue");
		combinations.reset(items);
		while(combinations.hasNext()) {
			System.out.println("Combination: " + combinations.next());
		}
	}
}
