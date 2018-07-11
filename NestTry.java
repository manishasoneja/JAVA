// this program is used to demonstrate nested try catch
class NestTry{
	public static void main(String args[]){
		int a = args.length;
		System.out.println("length is "+a);
		int res;
		try{
		res=2/a;	
			try{			
			res=a/(a-1);
			System.out.println("result is"+res);	
			int c[] = new int[2];
			c[5]=6;
		   	}
			catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("exception" +e1+"handled by inner try-catch block");
					}
			}
			catch(ArithmeticException e2){
			System.out.println("Exception " +e2+ "handled by outer try-catch block");
			}
		
		}
		}				 	
// an exception that has occured in the inner try and is not handled by that respective catch is passed on to outer try-catch block!				
			
		
		
