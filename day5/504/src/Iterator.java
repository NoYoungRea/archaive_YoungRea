
public class Iterator {
	Collection collection;
	int cursor;
	
	public Iterator(Collection collection) {
		this.collection=collection;
		cursor=0;
		
		
	}
	public boolean hasNext() {
		if(cursor<collection.getCount()) {
			return true;
		}
		return false;
	}
	public int next() {
		return collection.getAt(cursor++);
	}
}
