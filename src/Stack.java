import java.util.ArrayList;

/*implement basic operation of stack*/
public class Stack {
	
	private int stackTop;
	private ArrayList<Object> stack;
	
	public Stack() {
		this.stackTop = -1;
		this.stack = new ArrayList<Object>();
	}
	
	public Stack(Object array[], boolean leftToRight) {
		if(array.length > 0) {
			this.stackTop =  array.length - 1;
			this.stack = new ArrayList<Object>();
			if(leftToRight == false) {
				for (int i = array.length - 1; i>=0; i--) {
					this.stack.add(array[i]);
				}
			}
			else {
				for (int i = 0; i < array.length; i++) {
					this.stack.add(array[i]);
				}
			}
		}
	}
	
	public Stack(ArrayList<Object> array, boolean leftToRight) {
		if(array.size()> 0) {
			this.stackTop =  array.size() - 1;
			this.stack = new ArrayList<Object>();
			if(leftToRight == false) {
				for (int i = array.size() - 1; i>=0; i--) {
					this.stack.add(array.get(i));
				}
			}
			else {
				this.stack = array;
			}
		}
	}
	
	public void push(Object element) {
		this.stack.add(element);
		this.stackTop++;
	}
	
	public Object pop() {
		if(this.stackTop > 0) {
			Object p = this.stackTop;
			this.stack.remove(stackTop);
			this.stackTop--;
			return p;
		}
		return null;
	}
	
	public void pushMany(Object array[]) {
		if(array.length < 1) {
			return;
		}
		this.stackTop += array.length;
		for(int i = 0; i < array.length; i ++) {
			this.stack.add(array[i]);
		}
	}
	
	public Object[] popMany(int number) {
		if(number > this.stackTop+1) {
			return null;
		}
		Object array[] = new Object[number];
		for(int i = 0;i < number; i++) {
			array[i] = this.pop();
		}
		return array;
	}

}
