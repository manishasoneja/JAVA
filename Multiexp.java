//this program is used to demonstrate multiple catch statements in java and also array index out of bounds exception
class Multiexp{
	public static void main(String[] arg){
		int a = arg.length;
		System.out.println("the value of a is" +a);
		try{
		int b = 10/a;
		int c[] = new int[1];
		c[4]=5;
		  }
		catch(ArithmeticException e){
			System.out.println("Exception"+e);
				}
		catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("Exception"+e1);
						}
			}
		}
		
