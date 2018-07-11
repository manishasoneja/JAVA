// this program demonstrates thread priorities and thread name
class A extends Thread{
	public void run(){
	int i;
	System.out.println("This is Thread A . Thread Name is"+Thread.currentThread().getName()+"Thread priority is"+Thread.currentThread().getPriority());
	}
}
class B extends Thread{
	public void run(){
	int i;
	 System.out.println("This is Thread B . Thread Name is"+Thread.currentThread().getName()+"Thread priority is"+Thread.currentThread().getPriority());

	
	}
}
class C extends Thread{
	public void run(){
	int i;
	 System.out.println("This is Thread c . Thread Name is"+Thread.currentThread().getName()+"Thread priority is"+Thread.currentThread().getPriority());

	}
}
class ThreadPriority{
	public static void main(String args[]){
	A t1 = new A();
	B t2 = new B();
	C t3 = new C();
	t3.setPriority(10);
	t2.setPriority(t1.getPriority()+1);
	t1.setPriority(1);
	System.out.println("This is the main thread"+Thread.currentThread().getName()+"Thread Priority is"+Thread.currentThread().getPriority());
	//System.out.println(a+" "+b+" "+c);
	t1.start();
	t2.start();
	t3.start();
	
	}
}	
