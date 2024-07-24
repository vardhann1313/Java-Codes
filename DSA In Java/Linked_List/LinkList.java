package Linked_List;
public class LinkList {
    public static void main(String args[]){

		LinkedList l1 = new LinkedList();
		l1.addAtEnd(3);
		l1.addAtEnd(6);
		l1.addAtEnd(8);

		l1.addAtStart(2);
		l1.addAtStart(1);

		l1.addAtIndex(4, 3);

		// l1.deleteFirst();

		// l1.deleteLast();

		// l1.deleteIndex(5);

		l1.printList();
		l1.getHeadTail();
		l1.getSize();

	}
}

class Node{
	int data ;
	Node next ;
	Node(int data){
		this.data = data;
	}
}

class LinkedList {
	Node head ;
	Node tail ;
	int size = 0 ;

	LinkedList(){
		System.out.println("Linked List created !");
	}

	void addAtEnd(int data){
		Node n = new Node(data);
		if(this.head == null && this.tail == null){
			this.head = n ;
			this.tail = n ;
			this.size++ ;
		} else {
			Node temp = this.head ;
			while (temp.next != null) {
				temp = temp.next ;
			}
			temp.next = n ;
			this.tail = n ;
			this.size++ ;
		}
	}

	void addAtStart(int data){
		Node n  = new Node(data);
		if(this.head == null && this.tail == null){
			this.head = n ;
			this.tail = n ;
			this.size++ ;
		} else {
			n.next = this.head ;
			this.head = n ;
			this.size++ ;
		}
	}

	void addAtIndex(int data, int index){
		if(this.head == null && this.tail == null || index == 0){
			this.addAtStart(data);
		}else if(size == index){
			this.addAtEnd(data);
		}else if(index > size){
			System.out.println("Linked List size exceed !");
		}else {
			Node n = new Node(data);
			Node temp = this.head;
			int count = 0 ;

			while (count != (index-1)){
				temp = temp.next ;
				count++;
			}
			n.next = temp.next ;
			temp.next = n ;
			this.size++ ;
		}
	}

	void deleteFirst(){
		if(this.head == null){
			System.out.println("Linked List is empty !");
		} else {
			System.out.println("Deleted : " + this.head.data);
			this.head = this.head.next ;
			this.size-- ;
		}
	}

	void deleteLast(){
		if(this.head == null){
			System.out.println("Linked List is empty !");
		} else if (this.size == 1){
			deleteFirst();
		} else {
			Node temp = this.head ;
			int count = 1 ;
			while (count != (size-1)) {
				temp = temp.next ;
				count++ ;
			}
			temp.next = null ;
			this.tail = temp ;
			this.size-- ;
		}
	}

	void deleteIndex(int index){
		if(index == 0){
			this.deleteFirst();
		}else if(index == (this.size-1)){
			this.deleteLast();
		}else {
			Node temp = this.head;
			int count = 0 ;
			while(count != (index-1)){
				temp = temp.next;
				count++;
			}
			temp.next = temp.next.next;
			this.size--;
		}
	}

	void printList(){
		if(this.head == null){
			System.out.println("List is empty");
		}
		Node temp = this.head ;
		while (temp != null) {
			System.out.print(temp.data + " | ");
			temp = temp.next;
		}
		System.out.println("");
	}

	void getSize(){
		System.out.println("Size : " + this.size);
	}

	void getHeadTail(){
		System.out.println("Head : " + this.head.data + " | Tail : " + this.tail.data);
	}

}