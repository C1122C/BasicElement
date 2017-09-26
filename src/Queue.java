import java.util.ArrayList;

/*Implement of basic Queue operation*/
public class Queue {
	private Object queue[];
	private final int qCapacity = 200;
	private int qHead;
	private int qTail;
	private int qSize;
	
	public Queue() {
		this.qHead = this.qTail = this.qSize = 0;
		this.queue = new Object[qCapacity];
	}
	
	public Queue(Object array[], boolean leftToRight) {
		this.qTail = 0;
		this. queue= new Object[qCapacity];
		if(array.length <= 	qCapacity && array.length > 0) {
			this.qHead = array.length - 1;
			this.qSize = array.length;
			
			for(int i = 0;i< array.length;i++) {
				if(leftToRight == false) {
					this.queue[i] = array[array.length - i - 1];
				}
				else {
					this.queue[i] = array[i];
				}
			}
		}
		else {
			this.qHead = this.qSize = 0;
		}
	}
	
	public Queue(ArrayList<Object> array, boolean leftToRight) {
		this.qTail = 0;
		this. queue= new Object[qCapacity];
		if(array.size()> 0&& array.size() <= qCapacity) {
			this.qHead =  array.size() - 1;
			this.qSize = array.size();
			for (int i = 0;i < array.size();i++) {
				if(leftToRight == false) {
					this.queue[i] = array.get(array.size() - 1 - i);
				}
				else {
					this.queue[i] = array.get(i);
				}
			}
		}
		else {
			this.qHead = this.qSize = 0;
		}
	}
	
	public void push(Object element) {
		if(qSize == qCapacity) {
			return;
		}
		qSize++;
		if(qHead == qCapacity - 1) {
			qHead = 0;
		}
		else {
			qHead++;
		}
		queue[qHead] = element;
	}
	
	public Object pop() {
		if(qSize == 0) {
			return null;
		}
		Object p =queue[qTail];
		qSize--;
		if(qTail == qCapacity - 1) {
			qTail = 0;
		}
		else {
			qTail++;
		}
		return p;
	}
}
