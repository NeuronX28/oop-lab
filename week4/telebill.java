//name : vishweshwar shinde
//reg:230970059

import java.util.*;

class telephone
{
	int custid;
	String name;
	int phonenum;
	int billno;
	int numofcalls ;
	double  billamt;



	telephone()
		{
			billamt =100;
		}

	void input()
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter cust id :");
		 custid = sc.nextInt();
		 System.out.println("enter cust name :");
		 name = sc.next();
		 System.out.println("enter phone number :");
		 phonenum=sc.nextInt();
		 System.out.println("enter bill no:");
		 billno = sc.nextInt();
		 System.out.println("enter number of calls :");
		 numofcalls = sc.nextInt();

	}

	void display()
	{

	 System.out.println("enter cust id :"+custid);
	 System.out.println("enter cust name :"+name);
	 System.out.println("enter phone number :"+phonenum);
	 System.out.println("enter bill no:"+billno);
	 System.out.println("enter number of calls :"+numofcalls);
	}


	public void Calculate_bill_amt()
	{
		 System.out.println("here is calculated bill");

		 	if(numofcalls <=100)
		 	{
				billamt = 100;
			System.out.println("your billl amt is :"+ billamt);
			}

			else if(numofcalls >100 && numofcalls <=150)
			{
				billamt =100 + 0.6 * (numofcalls-100);
			System.out.println("your billl amt is :"+ billamt);
			}
			else if(numofcalls >150 && numofcalls <=200)
			{
				billamt = 100+0.5 * (numofcalls-150);
				System.out.println("your billl amt is :"+ billamt);
			}

			else if(numofcalls >200 )
			{
				billamt = 100+0.4 * numofcalls;
				System.out.println("your billl amt is :"+ billamt);
			}
 }
}



class telebill{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("wellcome to our telephone comapany" );
		int n;
		System.out.println("enter how many customber are there");
		n = sc.nextInt();
		telephone arr[] = new telephone[n];
		for(int i=0;i<n;i++)
			{
				arr[i]=new telephone();
				arr[i].input();
				arr[i].display();
				arr[i].Calculate_bill_amt();

			}

	}
}