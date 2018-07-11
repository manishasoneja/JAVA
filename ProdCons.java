import java.util.*;
class Producer implements Runnable{
	Shared sh;
	//int i=0;
	Producer(Shared sh,String name){
	this.sh=sh;
	Thread t = new Thread(this,"Producer");
	t.start();
	}
	public void run(){
	int i=0;
	while(true){
	try{
	sh.proddata(i++);
	Thread.sleep(2000);
	}
	catch(Exception e){
	}
	}

}
}
class Consumer implements Runnable{
	Shared sh;
	Consumer(Shared sh, String name){
	this.sh=sh;
	Thread t = new Thread(this,"Consumer");
	t.start();
	}
	public void run(){
	while(true){
	try{
	sh.consdata();
	Thread.sleep(2000);
	}
	catch(Exception e){
	}
	}
}
}
class Shared{
	int num;
	boolean statusval=false;
	public synchronized void proddata(int num) {
	/*this.num=num;
	System.out.println("Producer:"+num);	*/
	while(statusval){
	try{
	wait();}
	catch(InterruptedException e){
	}
	}
	this.num=num;
	System.out.println("Producer:"+num);
	statusval=true;
	notify();
	}
	public synchronized void consdata(){
	while(!statusval){
	try{
	wait();}
	catch(InterruptedException e){
	}
	}
	System.out.println("Consumer:"+num);
	statusval=false;
	notify();		
	}

}
class ProdCons{
	public static void main(String args[]){
	Shared share = new Shared();
	Producer p = new Producer(share,"Producer");
	Consumer c = new Consumer(share,"Consumer");
	//p.start();
	//c.start();
	}
}
