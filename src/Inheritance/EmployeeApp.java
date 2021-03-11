package Inheritance;
import java.util.Scanner;
public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee e1 = null;
		int choice;
		Boolean option;
		do{
		System.out.println("enter the choice");
		System.out.println("1.Manager \n 2. Salaesman");
		choice = sc.nextInt();
		switch(choice){
		case 1:
		System.out.println("enter the id");
		int mid = sc.nextInt();
		System.out.println("enter the name");
		String mname = sc.next();
		System.out.println("enter the department");
		String mdept = sc.next();
		System.out.println("enter the designation");
		String mdesg = sc.next();
		System.out.println("enter the mgrid");
		int mgrid = sc.nextInt();
		System.out.println("enter the achieved");
		int achieve = sc.nextInt();
		e1 = new Manager(mid,mname,mdept,mdesg,mgrid,achieve);
		break;
		case 2:
			System.out.println("enter the id");
			int sid = sc.nextInt();
			System.out.println("enter the name");
			String sname = sc.next();
			System.out.println("enter the department");
			String sdept = sc.next();
			System.out.println("enter the designation");
			String sdesg = sc.next();
			System.out.println("enter the mgrid");
			int mgr_id = sc.nextInt();
			System.out.println("enter the sales");
			int sales = sc.nextInt();
			
			Employee e2 = new SalesMan(sid,sname,sdept,sdesg,mgr_id,sales);
			break;
		}
		System.out.println("do you want to continue? type 1 or 0");
		option = sc.hasNextBoolean();
		}
		while(option);
			
	}
	

}
