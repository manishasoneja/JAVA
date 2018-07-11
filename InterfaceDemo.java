interface A{
	int a=5;
	int b=4;
	//int product=0;
       	public static void mul(){
	System.out.println("result is"+(a*b));
	}
}
class B implements A{
	public void display(){
	System.out.println("static methods in interface can be fully implemented");
	}
}

class InterfaceDemo{
	public static void main(String args[]){
	B b = new B();
	A.mul();
	b.display();
	}
}	 	

