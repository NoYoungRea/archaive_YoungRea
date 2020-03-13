
public class Collection {
	private int[] base;
	private int count;

	public Collection(int size) {
		base = new int[size];
		count = 0;
	}

	public void setBase(int[] base) {
		this.base = base;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public int[] getBase() {
		return base;
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
		
		return new Iterator(this);
	}
	

}
