package util;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();

		// 큐는 데이터를 순차적으로 처리
		// 많은 데이터를 한 곳에서 처리할때 사용

		// 서버 아키텍처에 사용(먼저온사람 먼저 처리)
		// 메세지 큐

		// 데이터가 많은데한곳에서 처리 할때
		// 데이터가 보내진 순서대로 처리 

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
