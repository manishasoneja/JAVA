//demonstrates use of throw
class ThrowDemo{
	static void throwdemo(){
	try{
	throw new NullPointerException("demo");	
	}
	catch(NullPointerException e){
	System.out.println("caught inside throw demo");
	throw e;	
	}	
	}
	public static void main(String[] args){
	try{	
	throwdemo();
	}
	catch(NullPointerException e){
	System.out.println("recaught in main"+e);
	}		
	}
}
