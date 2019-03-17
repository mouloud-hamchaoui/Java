package stack;

public class Stack<E> {

	private Node<E> head;
	private int length;

	public Stack() {
		this.head = null;
		this.length = 0;
	}

	public boolean isEmpty() {
		return this.head == null;
	}

	public int size() {
		return this.length;
	}

	public void push(E data) {
		Node<E> temp = new Node<E>(data);
		temp.data = data;
		temp.next = this.head;
		this.head = temp;
		this.length++;
	}

	public Node<E> pop() throws EmptyStackException {
		if (this.isEmpty())
			throw new EmptyStackException();
		Node<E> temp = this.head;
		this.head = this.head.next;
		this.length--;
		return temp;
	}

}
