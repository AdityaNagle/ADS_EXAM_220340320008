class Q3 {
	int max=10;
	int Q[]= new int[max];
	int top1,top2;
	Q3(int element){
	 max=element;
	 top1=element/2+1;
	 top2=element/2;
	 
	}
	
	void push1(int x){
		if(top1>0){
			top1--;
			Q[top1]=x;
		}
		else{
			System.out.println("Overfloaw");
			return ;
		}
	}
	void push2(int element){
		if(top2<max-1){
			top2++;
			Q[top2]=element;
		}
		else{
			return ;
		}
	}
	int pop1(){
		if(top1<=max/2){
			int x =Q[top1];
			top1++;
			return x;
		}
		else{
			System.out.println("Underflow");
			return 1;
		}
	}
	int pop2(){
		if(top2>=max/2){
			int x= Q[top2];
			top2--;
			return x;
		}
		else{
			
			System.out.println("Underflow");
			return 1;
		}
	}
	
	
	public static void main(String args[]){
		Q3 q = new Q3(5);
		q.push1(5);
		q.push2(10);
		q.push2(15);
		q.push1(11);
		q.push2(7);
		
		System.out.println(" ");
		
		System.out.println("Popped element from stack1 "+q.pop1());
		q.push2(40);
		System.out.println("Popped element from stack1 "+q.pop1());
		
		
	}
}