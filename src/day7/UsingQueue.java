package day7;

import java.util.Scanner;

interface Queue{
	boolean isEmpty();
	void Enqueue(int x);
	int Dequeue();
}

class MyQueue implements Queue{
	private int[] itemArray = new int[50];
	private int front, rear, count;
	
	public MyQueue() { //MyQueue�� ������
		front = 0;
		rear = 0;
		count = 0;
	}
	
	public boolean isEmpty() {
		if(count<=0) return true;
		return false;
	}
	
	public void Enqueue(int x) {
		if(count>50) {
			System.out.println("Queue full");
			return;
		}
		itemArray[rear] = x;
		rear = rear + 1;
		count++;
		System.out.println(x + "�Է� : ���Ұ���" + count);
	}

	public int Dequeue() {
		if(isEmpty()) {
			System.out.println("ť�� �����");
			return count;
		}
		int out = itemArray[front];
		front = front + 1;
		count--;
		System.out.println(out + "��� : ���Ұ��� " + count);
		return out;
	}
}

public class UsingQueue {
	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		for(int i=0; i<10; i++)
			mq.Enqueue(i);
		for(int i=0; i<10; i++)
			mq.Dequeue();
		mq.Dequeue();
	}
}