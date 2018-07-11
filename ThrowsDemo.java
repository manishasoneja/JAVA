/*this program is used to demonstrate the usage of throws keyword
in case of exceptions that arise in a method and are not handled they must be metioned using throws in method declaration*/
// all exceptions except error or runtime exception to be mentioned in method declaration
class ThrowsDemo{
	static void throwsdemo() throws IllegalAccessException{
	System.out.println("inside throws demo");
	throw new IllegalAccessException("demo");
	//System.out.println("this line is not printed"); //gives an error unreachble statement
	}
	public static void main(String args[]){
	try{
	throwsdemo();
	System.out.println("inside main" );
	}
	catch(IllegalAccessException e){
	System.out.println("exception caught in main"+e);
	}
	}
	
}	 
