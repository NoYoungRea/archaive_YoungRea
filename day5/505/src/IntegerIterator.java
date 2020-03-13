	
public class IntegerIterator extends Iterator{
	IntegerCollection collection;
	private int cursor;
	
	public IntegerIterator(IntegerCollection collection) {
		this.collection=collection;
		cursor=0;
	}
	public boolean hasNext() {
		if(cursor<collection.getCount()) {
			return true;
		}
		return false;
	}
	public Object next() {
		return collection.getAt(cursor++);
	}
}
