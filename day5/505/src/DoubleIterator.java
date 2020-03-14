
public class DoubleIterator extends Iterator{
	private DoubleCollection collection;
	private Node cursor;
	
	public DoubleIterator(DoubleCollection collection) {
		this.collection=collection;
		cursor=collection.getHead();
	}
	public boolean hasNext() {
		if(cursor==null)
			return false;
		else
			return true;
	}
	public Object next() {
		Node tmp=cursor;
		cursor=cursor.getNext();
		return tmp.getData();
	}
}
