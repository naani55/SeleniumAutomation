package javaFaqs;

public class Stack {

	int top = -1;
	int[] a = new int[10];

	void push(int val) {
		if (top == a.length - 1) {
			System.out.println("stack overflow");

		} else {
			top++;
			a[top] = val;

		}
	}

	void pop() {
		if (top == -1) {
			System.out.println("stack underflow");

		} else {
			top--;
			System.out.println("item deleted");
		}
	}

	void display() {
		if (top == -1) {
			System.out.println("Stack is empty");
		} else {
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);

			}

		}

	}

	public static void main(String[] args) {
		Stack s = new Stack();
		for (int i = 0; i <= 10; i++) {
			s.push(i);
		}
		s.display();
		for (int i = 0; i < 10; i++) {
			s.pop();
		}
		s.display();

	}

}
