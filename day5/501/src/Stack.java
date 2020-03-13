
public class Stack {
	private int[] members;
	private int top;
	
	public Stack(int size) {
		members=new int[size];
		top=0;
	}
	public void push(int value) {
		if(top>=members.length) {
			int[]tmp=new int[members.length+10];
			System.arraycopy(members, 0, tmp, 0, members.length);
			members=tmp;
		}
		members[top++]=value;
	}
	public int pop() {
		return members[--top];
	}
	public int getSize() {
		return top;
	}
	public boolean isEmpty() {
		return (top==0);
	}
}
