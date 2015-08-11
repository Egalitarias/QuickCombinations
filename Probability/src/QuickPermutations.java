
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class QuickPermutations<T> {

	private List<T> all = new ArrayList<T>();
	private List<T> current = new ArrayList<T>();
	private List<T> last = new ArrayList<T>();
	
	public void reset(Set<T> items) {
		current = new ArrayList<T>();
		if(items != null) {
			all = new ArrayList<T>(items);
			last = new ArrayList<T>();
			for(int index = 0; index < all.size(); ++index) {
				last.add(all.get(all.size() - 1));
			}
		} else
			all = new ArrayList<T>();
	}
	
	public boolean hasNext() {
		return current != null;
		
	}
	
	public List<T> next() {
		List<T> ret = new ArrayList<T>(current);
		iterate();
		return ret;
	}
	
	private void iterate() {
		if(current.equals(last)) {
			current = null;
			return;
		}
		
		for(int index = 0; index < all.size(); ++index) {
			if(current.size() == index) {
				current.add(all.get(0));
				return;
			}
			
			if(!current.get(index).equals(all.get(all.size() - 1))) {
				T item = current.get(index);
				int position = all.indexOf(item);
				++position;
				current.set(index, all.get(position));
				return;
			}
			
			current.set(index,  all.get(0));
		}
	}
}
