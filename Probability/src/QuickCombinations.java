
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class QuickCombinations<T> {

	private List<T> all = new ArrayList<T>();
	private Set<T> current = new HashSet<T>();
	
	QuickCombinations() {
		
	}
		
	public void reset(Set<T> items) {
		current = new HashSet<T>();
		if(items == null)
			all = new ArrayList<T>();
		else 
		    all = new ArrayList<T>(items);
	}
	
	public boolean hasNext() {
		return current != null;
	}
	
	public Set<T> next() {
		if(current == null)
			return null;
		
		Set<T> ret = new HashSet<T>(current);
		iterate();
		return ret;
	}
	
	private void iterate()
	{
		if(current.size() == all.size()) {
			current = null;
			return;
		}
		
		for(T item : all) {
			if(!current.contains(item)) {
				current.add(item);
				return;
			}
			current.remove(item);
		}
	}
}
