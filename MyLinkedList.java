
public class MyLinkedList {
	
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data=data;
		
		if(head==null) {
			head = node;
		}
		
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	
	
	public void display() {
		
		Node temp=head;
		
		while(temp.next==null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
}
