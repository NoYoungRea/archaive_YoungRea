
public class DoubleCollection extends Collection {

	private Node head=null;
	private int count=0;
	
	public DoubleCollection() {
		
	}
	public void add(double data) {
	
		if(head==null) {
			head=new Node(data,null);
		}
		else {
			Node tmp=head;
			while(tmp.getNext()!=null) {
				tmp=tmp.getNext();
			}
			tmp.setNext(new Node(data,null));

		}

	}

	public Iterator iterator() {
		return new DoubleIterator(this);
	}
	public Node getHead() {
		return head;
	}
	public int getCount() {
		return count;
	}
}
