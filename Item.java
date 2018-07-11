interface ItemConstants{
	int code = 101;
	String name = "fan";
	}
interface Item1 extends ItemConstants{
	public void display();
	//System.out.println(code+" "+name);	
	}
class Item2 implements Item1{
	public void display(){
	System.out.println(code+" "+name);
	System.out.println("implements method display");}
	}
class Item{
	public static void main(String args[]){
	Item2 i2 = new Item2();
	i2.display();	
}
}	 
	




