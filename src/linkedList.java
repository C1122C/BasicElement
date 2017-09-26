/*Implement basic operation of linked list*/

public class linkedList {
	
	private listNode head;
	
	public linkedList() {
		head = null;
	}
	
	public linkedList(listNode h) {
		head = h;
	}
	
	public listNode find(Object value) {
		listNode prober = head;
		for(;;) {
			if(prober.value.equals(value)) {
				return prober;
			}
			if(prober.nextN==null) {
				return null;
			}
			prober = prober.nextN;
		}
	}
	
	public void insert(listNode plug, listNode former) {
		plug.previousN = former.previousN;
		plug.nextN = former;
		former.previousN = plug;
	}
	
	public Object delete(listNode cancle) {
		cancle.previousN.nextN = cancle.nextN;
		cancle.nextN.previousN = cancle.previousN;
		return cancle.value;
	}
	
	public void modify(listNode mod, Object v) {
		mod.value = v;
	}
}
