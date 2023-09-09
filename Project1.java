import java.util.Scanner;
class  Project1
{
	public static void main(String[] args) 
	{
		int id=Integer.parseInt(args[0]);
		int[] empNo= new int[]{1001,1002,1003,1004,1005,1006,1007};
		String[] empName= new String[]{"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		String[] date= new String[]{"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
		char[] dCode= new char[]{'e','c','k','r','m','e','c'};
		String[] dep= new String[]{"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		int[] basic= new int[]{20000,30000,10000,12000,50000,23000,29000};
		int[] hra=new int[]{8000,12000,8000,6000,20000,9000,12000};
		int[] it= new int[]{3000,9000,1000,2000,20000,4400,10000};
		int[] da= new int[]{20000,32000,12000,50000,40000};
		boolean b=true;
		for(int i=0;i<empNo.length;i++)
		{
			if(empNo[i]==id)
			{
				System.out.println("Emp No."+"  "+"Emp Name"+"    "+"Department"+"   "+"Designation"+"   "+"Salary");
				System.out.print(empNo[i]+"       ");
				System.out.print(empName[i]+"         ");
				System.out.print(dep[i]+"        ");
				switch(dCode[i])
				{
					case 'e':System.out.print("Engineer"+"     ");
							 System.out.print(basic[i]+hra[i]+da[0]-it[i]);
							 break;
					case 'c':System.out.print("Consultant"+"    ");
							 System.out.print(basic[i]+hra[i]+da[1]-it[i]);
							 break;
					case 'k':System.out.print("Clerk"+"       ");
							 System.out.print(basic[i]+hra[i]+da[2]-it[i]);
							 break;
					case 'r':System.out.print("Receptionist"+"  ");
							 System.out.print(basic[i]+hra[i]+da[3]-it[i]);
							 break;
					case 'm':System.out.print("Manager"+"   ");
							 System.out.print(basic[i]+hra[i]+da[4]-it[i]);
							 break;
					default:break;
				}
				b=false;
				break;
			}
		}
		if(b)
		{
			System.out.println("There is no employee with empid : "+id);
		}
	}
}