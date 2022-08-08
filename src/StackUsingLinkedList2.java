
import static java.lang.System.exit;

public class StackUsingLinkedList2 {
	/**
	 * 
	 * @author kastu
	 *
	 */
	private class Node {
		/*
		 * integer data & reference variable node type
		 */
		int data;
		Node link;
	}

	/*
	 * Defining node top
	 */
	Node top;

	/*
	 * Defining Constructor
	 */
	StackUsingLinkedList2() {
		this.top = null;
	}

	/*
	 * Defining method push to add elements in stack
	 */
	public void push(int x) {
		/*
		 * creating new node temp
		 */
		Node temp = new Node();

		/*
		 * check if stack (heap) is full. Then inserting an element would lead to stack
		 * overflow
		 */
		if (temp == null) {
			System.out.print("Heap Overflow");
			return;
		}

		/*
		 * initialize data into temp data field
		 */
		temp.data = x;

		/*
		 * put top reference into temp link
		 */
		temp.link = top;

		/*
		 * update top reference
		 */
		top = temp;
	}

	/*
	 * Utility function to check if the stack is empty or not
	 */
	public boolean isEmpty() {
		return top == null;
	}

	/*
	 * Utility function to return top element in a stack
	 */
	public int peek() {
		/*
		 * check for empty stack
		 */
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	/*
	 * Utility function to pop top element from the stack
	 */
	public void pop() {
		/*
		 * check for stack underflow
		 */
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}

		/*
		 * update the top pointer to point to the next node
		 */
		top = (top).link;
	}

	public void display() {
		/*
		 * check for stack underflow
		 */
		if (top == null) {
			System.out.printf("\nStack Underflow");
			exit(1);
		} else {
			Node temp = top;
			while (temp != null) {

				/*
				 * print node data
				 */
				System.out.printf("%d->", temp.data);

				/*
				 * assign temp link to temp
				 */
				temp = temp.link;
			}
		}
	}

	/**
	 * main class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * create Object of Implementing class
		 */
		StackUsingLinkedList2 obj = new StackUsingLinkedList2();
		/*
		 * insert Stack value
		 */
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);

		/*
		 * print Stack elements
		 */
		obj.display();

		/*
		 * print Top element of Stack
		 */
		System.out.printf("\nTop element is %d\n", obj.peek());

		/*
		 * Delete top element of Stack
		 */
		obj.pop();
		obj.pop();

		/*
		 * print Stack elements
		 */
		obj.display();

		/*
		 * print Top element of Stack
		 */
		System.out.printf("\nTop element is %d\n", obj.peek());
	}
}
