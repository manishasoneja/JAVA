// used to demonstrate yield stop sleep methods
class A extends Thread{
	public void run(){
	int i;
	for(i=1;i<=5;i++){
	if(i==1)yield();
	System.out.println("From thread A"+i);
	}
	System.out.println("exit from thread A");
}	
}
class B extends Thread{
	public void run(){
	int i;
	  for(i=1;i<=5;i++){
        if(i==3)stop();
        System.out.println("From thread B"+i);
        }
        System.out.println("exit from thread B");
}
}
class C  extends Thread{
	public void run(){
          for(int i=1;i<=5;i++){
        System.out.println("From thread C"+i);
	try{
	sleep(1000);
	}
	catch(Exception e){
	}
        }	
        System.out.println("exit from thread C");
}
}
class ThreadMethods{
	public static void main(String args[]){
	A t1 = new A();
	B t2 = new B();
	C t3 = new C();
	System.out.println("Starting from thread A");
	t1.start();
	System.out.println("Starting from thread B");
	t2.start();
	System.out.println("Starting from thread C");
	t3.start();
	System.out.println("end of main thread");
	}
}


