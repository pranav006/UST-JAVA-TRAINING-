import java.util.Scanner;



class LNode{
	int data;
	LNode next;
	LNode(int data){
		this.data=data;
		this.next=null;
	}
}
class stack1{
	LNode push(int v,LNode head) {
		LNode newnode=new LNode(v);
		if(head==null)
			head=newnode;
		else
		{
			newnode.next=head;
			head=newnode;
		}
		return head;
	}
	LNode pop(LNode head)
	{
		if(head==null)
			System.out.println("underflow");
		else
		{
			System.out.println("element popped"+ head.data);
			head=head.next;
		}return head;
	}
int peek(LNode head)
{
	if(head == null)
		return -1;
	return head.data;
}

boolean isEmpty(LNode head)
{
	if(head==null)
		return true;
	else
		return false;
}
void display (LNode head)
{
	System.out.println("Stack : \n");
	if(head==null)
	{
		System.out.println("No nodes");
		return;
	}
	
	LNode tempNode = head;
	
	while(tempNode != null)
	{
		System.out.print(tempNode.data + " ");
		tempNode=tempNode.next;
	}
	
}


public class LLStack {
public static void main (String[] args ) 
{
	stack1 s = new stack1();
	LNode head = null;
	Scanner in = new Scanner(System.in);
	do {
		System.out.println("\n -------Stack using linked list-------\n");
		System.out.println("\n1. Push an element");
		System.out.println("\n2. Pop an element");
		System.out.println("\n3. Peek at the top");
		System.out.println("\n4. If stack is empty");
		System.out.println("\n5. Display");
		System.out.println("\n6. Exit");
		
		System.out.println("\n Enter your choice");
		switch(in.nextInt())
		{
			case 1:
				System.out.println("Pls enter a value to be Pushed");
			    head=s.push(in.nextInt(),head);
			break;
			case 2:
				head= s.pop(head);
				break;
			case 3:
				System.out.println("top element" + s.peek(head));
				break;
			case 4:
				System.out.println("stack empty" + s.isEmpty(head));
			case 5:
				System.out.println("\n-------Stack-------");
				s.display(head);
				break;
			case 6:
				System.exit(0);
				break;
		}
		System.out.println("press 1 to continue");
	}
	while(in.nextInt()==1);
	in.close();
}
}

}