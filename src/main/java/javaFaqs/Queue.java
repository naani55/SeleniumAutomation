package javaFaqs;

public class Queue {

	int[] a = new int[10];
	int front = 0, rear = 0;

	void insert(int val) {
		if (rear == a.length) {
			System.out.println("queue overflow");
		} else {
			a[rear] = val;
			rear++;
		}
	}

	void delete() {
		if (front == 0 && rear == 0) {
			System.out.println("queue underflow");
		}

		else {
			front++;
		}

	}

	void display() {
		if (front == rear) {
			System.out.println("queue is empty");
		} else {
			for (int i = front; i < rear; i++) {
				System.out.println(a[i]);
			}
		}

	}

	public static void main(String[] args) {
		Queue q1 = new Queue();
		System.out.println("=========================================");
		for (int i = 0; i < 10; i++) {
			q1.insert(i);

		}
		System.out.println("=========================================");
		q1.display();
		System.out.println("=========================================");
		q1.delete();
		System.out.println("=========================================");
		q1.insert(25);
		System.out.println("=========================================");
		q1.insert(21);
		System.out.println("=========================================");
		q1.display();
		System.out.println("=========================================");
	}

}
