class Q2 {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	void display(){
		Node n=head;
		while(n!=null){
			System.out.print(n.data+"-->");
			n=n.next;
		}
	}
	public static void main(String args[]){
		Q2 l1 = new Q2();
		l1.insert(1);
		l1.insert(5);
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(4);
		l1.insert(5);
		l1.display();
		
		
		
	}
}