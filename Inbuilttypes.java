//used to demonstrate number format exception and  null pointer exception
import java.io.*;
class Inbuilttypes{
	public static void main(String args[]) throws FileNotFoundException,IOException{
	String name=null;
	String s ="abc"; 
	try{
	File file = new File("file.txt");
	FileReader fr = new FileReader(file);
	BufferedReader br = new BufferedReader(fr);
	int i;
	for(i=0;i<3;i++)
		System.out.println(br.readLine());}
	catch(FileNotFoundException e){
	System.out.println("Exception" +e);
	}
	try{
	if(name.equals("abc")){
	System.out.println("same");
	}
	else{
	System.out.println("not same");
	}
	}
	catch(NullPointerException e){
	System.out.println("Exception caught:"+e);
	}
	try{
	System.out.println(Integer.parseInt(s));
	}
	catch(NumberFormatException e){
	System.out.println("Exception:" + e.toString());
	}
	}
}
