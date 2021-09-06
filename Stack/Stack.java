package Stack;

public class Stack {

		Node head;
		static class Node{
			int data;
			Node next;
			Node(int d)
			{
				data=d;
				next=null;
			}	
		}
		public static void main(String[] args) {
			Stack stack = new Stack();
			stack.isEmpty();
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.printList();
			stack.pop();
			stack.printList();
			System.out.println(stack.peek());
			stack.printList();
			stack.isEmpty();
			
		}
		void push(int data){
			Node node=new Node(data);
			if(head!=null){
				Node temp=head;
				node.next=temp;
				head=node;
		}
			else{
				head=node;
			}
		}
		void printList(){
			Node temp=head;
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		void pop(){
			Node temp=head;
			if(temp!=null){
				head=head.next;
			}
		}
		 int peek(){
			 if(head!=null){
				 return head.data;
			 }
			return -1;
		 }
		 void isEmpty(){
			 if(head==null){
				 System.out.println("Stack is Empty");
			 }
			 else{
				 System.out.println("Stack is not Empty");
			 }
		 }
		
	}

