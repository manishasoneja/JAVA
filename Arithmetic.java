//this program demonstrates arithmetic exception
import java.util.Scanner;
class Arithmetic{
		public static void main(String[] args){
			int a,b;
			int res;
			System.out.println("Enter value of a");
			Scanner din = new Scanner(System.in);
			a=din.nextInt();
			b=din.nextInt();
			try{
			res=a/b;
			System.out.println("result:"+res);
			}
			/*catch(ArithmeticException e) {
				System.out.println("Exception caught");
					}*/ 
			//following code below is a variation  to catch block
			catch(ArithmeticException e){
				System.out.println("Exception"+e);
						} // this gives the name of the exception
			finally{
				System.out.println("Inside finally");
				}
			}
		}				
				
			
