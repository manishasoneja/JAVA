// this program demonstrates the creation of threads using thread class
class A extends Thread{
	public void run(){
	int i;
	for(i=1;i<=5;i++){
		System.out.println("From thread A: i="+i);
	}
	}
}
class B extends Thread{
	public void run(){
	int i;
	for(i=1;i<=5;i++){
	System.out.println("From thread B: i="+i);
	}
	}
}
class C extends Thread{
	public void run(){
	int i;
	for(i=1;i<=5;i++){
	System.out.println("From thread C:i="+i);
	}
	}
}
class Multi{
	public static void main(String args[]){
	A t1 = new A();
	//t1.stop(); -> to kill a thread use stop method
	t1.start();
	B t2 = new B();
	t2.start();
	C t3 = new C();	
	t3.start();
	}
}	
