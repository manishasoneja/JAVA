interface college{
	int principal=1;
	public void office();
}
interface campus{
	public void staff();
	public void department();
}
class Student{
	int n;
	Student(int no){
	n=no;
	}
	}	
class Record extends Student implements college,campus{
		int noofteachstaff;
		int noofdepartment;
		int noofnonteachstaff;
		Record(int nodept, int noteach, int nonteach, int nostudents){
		super(nostudents);
		noofteachstaff=noteach;
		noofdepartment=nodept;
		noofnonteachstaff=nonteach;
		}
	public void office(){
	System.out.println("******");
	System.out.println("NO OF PRINCIPAL"+principal);
	System.out.println("NO OF NONTEACHING STAFF"+noofnonteachstaff);
	}
	public void staff(){
	 System.out.println("******");
        System.out.println("NO OF TEACHING STAFF"+noofteachstaff);
        }
	public void department(){
	 System.out.println("******");
        System.out.println("NO OF STUDENTS"+n);
        System.out.println("NO OF DEPARTMENTS "+noofdepartment);
        }

	public static void main(String args[]){
	Record r = new Record(5,25,16,750) ;
	r.office();
	r.staff();	
	r.department();
	}
}	
	                                						
