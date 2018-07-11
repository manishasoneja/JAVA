class Customer extends Thread
{
	int seat;
	Reservation res;
	Customer(Reservation r,int s)
	{
		this.res=r;
		this.seat=s;
		start();
	}
	public void run()
	{
		res.book(seat);
	}
	
}

class Reservation
{
	int seatavaliable=20;
	public synchronized void book(int s)
	{
		System.out.println("\nEnter Thread : "+Thread.currentThread().getName());
		System.out.println("Avaliable seats = "+seatavaliable+" Requested = "+s);
		if(seatavaliable>s)
		{
			System.out.println("Seats are avaliable Booking started");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
			}
			System.out.println(s+" booked by "+Thread.currentThread().getName());
			seatavaliable -=s;
		}
		else
		{
			System.out.println("Not Avaliable ");
		}
		System.out.println("Leaving Thread : "+Thread.currentThread().getName());
		
	}

}

class SeatBooking
{
	public static void main(String args[])
	{
		Reservation r = new Reservation();
		Customer c1 = new Customer(r,3);
		Customer c2 = new Customer(r,5);
	 	Customer c3 = new Customer(r,10);
		Customer c4 = new Customer(r,5);

	}
}
