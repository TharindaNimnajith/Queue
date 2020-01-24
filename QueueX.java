package dsa;

public class QueueX {
	private double[] queueArray;
	private int front;
	private int rear;
	private int nItems;
	private int maxSize;
	
	public QueueX(int s) {
		maxSize = s;
		queueArray = new double[maxSize];
		nItems = 0;
		front = 0;
		rear = -1;
	}
	
	public boolean isFull() {
		if(rear == maxSize - 1)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty() {
		if(nItems == 0)
			return true;
		else
			return false;
	}
	
	public void insert(double j) {
		if(isFull()) {
			System.out.println("The queue is full");
		}
		else {
			rear++;
			queueArray[rear] = j;
			nItems++;
		}
	}
	
	public double remove() {
		if(isEmpty()) {
			System.out.println("The queue is empty");
			return -99;
		}
		else {
			double temp = queueArray[front];
			front++;
			nItems--;
			return temp;
		}
	}
	
	public double peekFront() {
		if(isEmpty()) {
			System.out.println("The queue is empty");
			return -99;
		}
		else {
			return queueArray[front];
		}
	}
}
