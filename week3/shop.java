import java.util.Scanner;

class discount{
	Double itemid;
	String itemname;
	Double quantity;
	Double unit_price;
	Double totalbill;
		Scanner sc = new Scanner (System.in);

	public void getdata(){
		System.out.println("Enter item ID ");
		itemid = sc.nextDouble();

		System.out.println("Enter item name ");
		 itemname = sc.next();

		System.out.println("Enter unit price ");
		unit_price = sc.nextDouble();

		System.out.println("Enter NUmber of pieces ");
				quantity = sc.nextDouble();
		}

		public void display(){
			totalbill= unit_price*quantity;
			if(totalbill <500){
				System.out.println("Your total bill is : "+ totalbill);
				}

				else if( totalbill>500 && totalbill<1000){
					totalbill=totalbill-(totalbill*0.1);
					System.out.println("Woah!! you got 10% discount");
					System.out.println("Your total bill is : "+ totalbill);
					}
				else if( totalbill>1000 && totalbill<1500){
					totalbill=totalbill-(totalbill*0.12);
					System.out.println("Woah!! you got 12% discount");
				    System.out.println("Your total bill is : "+ totalbill);
					}
				else if( totalbill>2000){
					totalbill=totalbill-(totalbill*0.15);
					System.out.println("Woah!! you got 15% discount");
					System.out.println("Your total bill is : "+ totalbill);
					}
			}

	}

	public class shop{
		public static void main(String args[]){
			Scanner sc = new Scanner (System.in);

			int choice;
			discount data = new discount();

			while(true)
			{

				System.out.println("Enter your choice \n 1.Bill input \t 2.Total bill \t 3.EXIT");
				choice = sc.nextInt();
				switch(choice){
					case 1 :
					data.getdata();
					break;
					case 2 :
					data.display();
					break;

					case 3 :
					System.exit(0);
					break;


					default :
					System.out.println("Invalid input");
				}

				}

			}
		}
