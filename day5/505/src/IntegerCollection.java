
public class IntegerCollection {
	private int[] base;
	private int count;

	public IntegerCollection(int size) {
		base = new int[size];
		count = 0;
	}



	public int getCount() {
		return count;
	}


	public void add(int value) {
		if (count < base.length) {
			base[count++] = value;
		}
	}

	public int getAt(int idx) {
		if (idx < count) {
			return base[idx];
		}
		return -1;
	}
	public Iterator iterator() {
		
		return new IntegerIterator(this);
	}
	

}

