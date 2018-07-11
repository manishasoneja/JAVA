import java.util.Scanner;
class Account{
	int accno;
	double balance;
	Account(int acno,double bal){	
	accno=acno;
	balance=bal;
	}
	public void depositAmount(double amount){
	balance=balance+amount;
	}
	public void withdraw(double amount) throws NoSufficientAmountException{
	if(balance>=amount){
	balance=balance-amount;	
	}
	else{
	double diff = amount-balance;
	throw new NoSufficientAmountException(diff);
	}
	}
}
class NoSufficientAmountException extends Exception{
        double amount;
        NoSufficientAmountException(double amount1){
        amount=amount1;
        }
        public double getamount(){
        return amount;
        }			
	public static void main(String args[]) throws NoSufficientAmountException{
	int choice;
	int b;
	double amt;
	System.out.println("1.deposit 2.withdraw");
	 Scanner din = new Scanner(System.in);
	//System.out.println("enter val of b");
	Account ac = new Account(123,10000);
	do{
	System.out.println("Enter choice");
	choice=din.nextInt();
	switch(choice){	
	case 1: {
                System.out.println("enter the amount to be deposited");
		amt=din.nextDouble();
		ac.depositAmount(amt);
		System.out.println("current balance:"+ac.balance);
		break;
                }
	case 2:{
		System.out.println("enter the amount to be withdrawn");
		amt=din.nextDouble();
		try{
		ac.withdraw(amt);
		System.out.println("Balance"+ac.balance);
		}
		catch(NoSufficientAmountException e){
		System.out.println("You have a shortage of"+e.getamount());
		}
		break;
		}	
	}	
System.out.println("enter val of b");
b=din.nextInt();
	}
while(b==1);
}
}	
