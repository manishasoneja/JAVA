class Pyramid{
	synchronized void draw_pyramid(char ch){
	for(int i=0;i<10;i+=2){
		for(int k=10-i;k>0;k-=2){
			System.out.print(" ");
		} 
		for(int j=0;j<=i;j++){
		System.out.print(ch);   
		}
		System.out.println();                                                                           
		
	}
	}
}
class A extends Thread{
	Pyramid p;
	A(Pyramid p){
	this.p=p;
	}
	public void run(){
	p.draw_pyramid('*');	
	}
	}
class B extends Thread{
        Pyramid p;
        B(Pyramid p){
        this.p=p;
                }
        public void run(){
        p.draw_pyramid('#');
        }
}	
class SynchTest{
	public static void main(String arg[]){
	Pyramid pobj = new Pyramid();
	A t1 = new A(pobj);
	B t2 = new B(pobj);
	t1.start();
	t2.start();
	}


}
	