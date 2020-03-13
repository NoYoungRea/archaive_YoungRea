
public class Stack {
	private IntBox members=null;
	private int top;
	
	public Stack() {
		top=0;
	}
	public void push(int value) {

		members=new IntBox(value,members);
		
	}
	public int pop() {
		top--;
		int tmp=members.getData();
		members=members.getNextBox();
		return tmp;
	}
	public int getSize() {
		return top;
	}
	public boolean isEmpty() {
		return (top==0);
	}
}
