import java.util.Scanner;
class LLNode{
	int data;
	LLNode next;
	
	
	LLNode(int data ){
		this.data=data;
		this.next=null;
	}
	
	
	
}


public class LinkedList {

	LLNode head;
	
	LLNode insertInBeg(int value, LLNode head) {
		
		
		LLNode newnode = new LLNode(value);
		
		if(head==null)
			head = newnode;
		else
		{
			newnode.next = head;
			head = newnode;
		}
		return head;
	}
	
	
	LLNode insertAtEnd(int value, LLNode head) {
		
		LLNode newnode = new LLNode(value);
		LLNode currNode = head;
		
		if(currNode == null) {
			head = newnode;
		}
		else {
			while (currNode.next!= null)
				currNode = currNode.next;
			
			currNode.next = newnode;
		}
		return head;
	}
	
	LLNode delete(int pos,LLNode head) {
		LLNode currnode=head;
		if(pos==1)
			head = currnode.next;
		else
		{
			for(int i=1;(currnode != null) && i < pos-1;i++)
             currnode=currnode.next;
             currnode.next = currnode.next.next;
		}
		return head;
	}
	
	int length(LLNode head) {
		int count = 0;
		LLNode currnode = head;
		if (currnode ==null)
			return 0;
		else
		{
			while(currnode.next !=null)
			{
				currnode = currnode.next;
				count++;
			}
			return count;
		}
	}
	
	void display(LLNode head) {
		LLNode currnode = head;
		while(currnode.next !=null)
		{
			System.out.print(currnode.data + " ");
			currnode = currnode.next;
		}
		System.out.print(currnode.data + " ");
	}
	public static void main (String[]args) {
		LinkedList llist = new LinkedList();
		
		llist.head = null ;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("\n-----Linked list operations-----");
			System.out.println("\n1 Insert at the end");
			System.out.println("\n2. Insert in the beginning");
			System.out.println("\n3. Delete a position");
			System.out.println("\n4. Length of the linked list");
			System.out.println("\n5. Display");
			System.out.println("\n6. Exit");
			System.out.println("\n. Enter your choice");
			
			
			switch(in.nextInt())
			{
				case 1:
					System.out.println("Pls enter a value");
				llist.head= llist.insertAtEnd(in.nextInt(),llist.head);
				break;
				case 2:
					System.out.println("Please enter a value");
					llist.head= llist.insertInBeg(in.nextInt(),llist.head);
					break;
				case 3:
					System.out.println("	Please enter the position");
					llist.head= llist.delete(in.nextInt(),llist.head);
					break;
				case 4:
					System.out.println("\nNumber of items in the linked list "+ llist.length(llist.head));
					break;
				case 5:
					System.out.println("----LInked list----");
					llist.display(llist.head);
			        break;
			        
				case 6:
					System.exit(0);
					break;
					
					default:
						System.out.println("Wrong choice");
			}
			System.out.println("\npress 1 to continue");
		}
		while(in.nextInt()==1);
		in.close();
	}
	}

