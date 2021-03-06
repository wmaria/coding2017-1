package basic;

//栈
public class Stack {
	// 头节点
	private Node first;
	// 尾节点
	private Node last;
	// 元素个数
	private int size = 0;

	// 出栈
	private void pop() {
       removeLast();
	}

	// 入栈
	private void push(Object o) {
		addLast(o);
	}
	private boolean isEmpty(){
		if(size==0){
			return true;
		}else{
			return false;
		}
	}
	private int size(){
		return size;
	}
	private void removeLast(){
		final Node f = last.prev;
		last = f;
		f.next =null;
	}
	
	
	private void addLast(Object o){
		final Node f= first;
		final Node l = last;
		final Node newNode = new Node(o, last, null);
		if(f==null){
			first =newNode;
		}else{
			l.next = newNode;
		}
		size++;
	}

	private static class Node {
		Object data; // 数据域
		Node next;// 后继
		Node prev;// 前驱

		public Node(Object o, Node n, Node p) {
			this.data = o;
			this.prev = p;
			this.next = n;
		}
	}
}
