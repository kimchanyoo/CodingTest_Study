package BackJoon.Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class PopABalloon {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Deque<Ballon> deque = new ArrayDeque<>();
		int[] ballonInput = new int[n];
		sb.append("1 ");

		for (int i = 0; i < n; i++) {
			ballonInput[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i < n; i++) {
			deque.add(new Ballon(i + 1, ballonInput[i]));
		}
		int move = ballonInput[0];

		while (!deque.isEmpty()) {
			if (move > 0) {
				for (int i = 1; i < move; i++) {
					deque.addLast(deque.removeFirst());
				}
				move = deque.getFirst().num;
				sb.append(deque.removeFirst().index).append(" ");
			} else {
				for (int i = 1; i < -move; i++) {
					deque.addFirst(deque.removeLast());
				}

				move = deque.getLast().num;
				sb.append(deque.removeLast().index).append(" ");
			}
		}
		System.out.println(sb);
	}

	static class Ballon {
		int index;
		int num;

		public Ballon(int index, int num) {
			this.index = index;
			this.num = num;
		}
	}
}
