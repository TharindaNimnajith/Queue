package dsa;

public class MainApp {
	public static void main(String[] args) {
		QueueX queue1 = new QueueX(5);
		
		System.out.println(queue1.remove());
		System.out.println(queue1.peekFront());
		
		queue1.insert(4);
		queue1.insert(5);
		queue1.insert(4);
		queue1.insert(4);
		queue1.insert(6);
		
		System.out.println(queue1.peekFront());
		
		while(!queue1.isEmpty())
			System.out.println(queue1.remove());
		
		System.out.println(queue1.peekFront());
		System.out.println(queue1.peekFront());
	}
}
