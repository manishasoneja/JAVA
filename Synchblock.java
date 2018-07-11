class Callme{
	String msg;
	void call(String s){
	System.out.print("["+s);
	try{
	Thread.sleep(1000);
	}
	catch(InterruptedException e){
	}
	System.out.println("]");
	}
}
class Caller implements Runnable{
	String message;
	Callme target;
	Thread t;
	 public Caller(String m,Callme targ){
	message=m;
	target=targ;
	t = new Thread(this);
	System.out.println(t);
	t.start();
	}
	public void run(){
	synchronized(target){
	target.call(message);
	}
	}
}
class Synchblock{
	public static void main(String[] args){
	Callme target = new Callme();
	Caller c = new Caller("HELLO",target);
	Caller c1 = new Caller("SYNCH",target);
	Caller c2 = new Caller("WORLD",target);
	try{
	c.t.join();
	c1.t.join();
	c2.t.join();
	}
	catch(InterruptedException e){
	System.out.println("EXCEPTION INTERRUPTED");
	}
}
}		
