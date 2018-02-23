package util;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();

		// 큐는 데이터를 순차적으로 처리
		// 많은 데이터를 한 곳에서 처리할때 사용

		queue.offer("둘리");
		queue.offer("마이콜");
		queue.offer("도우넛");
		queue.offer("길동");

		System.out.println(queue.isEmpty());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		System.out.println(queue.isEmpty());

		System.out.println(queue.poll()); 
	}
}
