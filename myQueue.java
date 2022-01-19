

class Queue
{
	int front;
	int rear;
	int[] arr;
	
	
	Queue(){
		front = -1;
		rear = -1;
		arr = new int[7];
		System.out.print("Queue printed ");
		}
	
	
	void enQueue(int ele) {
		if(rear == arr.length - 1)
			System.out.println("\nQueue full - overflow");
		else
		{
			++rear;
			arr[rear] = ele;
		}
		if (front == -1)
		
			front++;
	}
		
	int deQueue() {
		int x = -1;
		if(front ==-1)
			System.out.print("\nQueue empty - underflow");
		else
		{
			x = arr[front++];
		if(rear == 0)
			rear--;
		}
		return x;
}
	
	void display() {
		
		System.out.println("\n------Queue elements------");
		for(int i=front;i<=rear;i++)
			System.out.print(arr[i]+ " ");
		System.out.println();
	}
}



public class myQueue {

	public static void main(String[] args) 
	{
Queue q = new Queue();
q.enQueue(10);
q.enQueue(20);
q.enQueue(33);
q.enQueue(44);
q.enQueue(55);
q.enQueue(88);
q.enQueue(87);
q.display();

	}
}
	
