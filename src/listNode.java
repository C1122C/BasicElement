/*Class definition of list node*/
public class listNode {
	
	public Object value;
	public listNode nextN;
	public listNode previousN;
	
	public listNode() {
		this.value = null;
		this.nextN = null;
		this.previousN = null;
	}
	
	public listNode(Object v) {
		this.value = v;
		this.nextN = null;
		this.previousN = null;
	}
	
	public listNode(Object v, listNode p, listNode n) {
		this.value = v;
		this.nextN = p;
		this.previousN = n;
	}
	
}
