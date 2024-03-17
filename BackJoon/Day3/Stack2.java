package BackJoon.Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Stack2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		MyStack<Integer> myStack = new MyStack<>();
		int[] result = new int[n];
		int location = 0;

		for(int i = 0; i < n; i++){
			st = new StringTokenizer(br.readLine()," ");
			int c = Integer.parseInt(st.nextToken());
			if(c == 1){
				int num = Integer.parseInt(st.nextToken());
				myStack.push(num);
			}else if(c == 2){
				if(myStack.isEmpty()){
					result[location] = -1;
				}else{
					result[location] = myStack.pop();
				}
				location++;
			}else if(c == 3){
				result[location] = myStack.stackSize();
				location++;
			}else if(c == 4){
				if(myStack.isEmpty()){
					result[location] = 1;
				}else{
					result[location] = 0;
				}
				location++;
			}else if(c == 5){
				if(myStack.isEmpty()){
					result[location] = -1;
				}else{
					result[location] = myStack.peek();
				}
				location++;
			}
		}

		for(int i = 0; i < location; i++){
			System.out.println(result[i]);
		}
	}
}

class MyStack<E>{
	private ArrayList<E> list;
	private int top;

	public MyStack(){
		this.list = new ArrayList<>();
		this.top = -1;
	}
	public int stackSize(){
		return list.size();
	}

	public boolean isEmpty(){
		return top == -1;
	}

	public void push(E value){
		list.add(++top, value);
	}

	public E pop(){
		E value = list.get(top);
		list.remove(top--);
		return value;
	}

	public E peek(){
		return list.get(top);
	}

	public int search(E value){
		int result = list.lastIndexOf(value);

		if(result != -1){
			return top - result + 1;
		}else{
			return result;
		}
	}
}

