abstract class area1{
	int a;
	int b;
	int area;
	area1(int len,int wid){
	a=len;
	b=wid;
	}
     abstract void rectangle();	
	void triangle(){
	area=(a*b)/2;
	System.out.println("Area of triangle:"+area);
	}
	}
class Base extends area1{
	Base(int c, int d){
	super(c,d);
	}
	void rectangle(){
	area=a*b;
	System.out.println("Area of rectangle:"+area);
	}
}
class Abstract{
	public static void main(String args[]){
	Base b1 = new Base(6,2);
	b1.rectangle();
	b1.triangle();
	}
}	
		
