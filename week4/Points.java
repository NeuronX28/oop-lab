//name : vishweshwar shinde
//reg:230970059
/* Consider a class called Points with x-coordinate and y-coordinate as its data members.
Create three objects P1, P2 and P3, which represent three points in a plane.
• Calculate and the distance between P1 and P2 (by passing the coordinates of one point
as arguments).
• Calculate and the distance between P1 and P3 (by passing one point itself as argument).
*/
import java.util.*;

public class Points{
	double x;
	double y;

	Points(double x, double y){
		this.x = x;
		this.y = y;
	}

	void ToP2(double x2, double y2){
		System.out.println("Distance between p1 and p2: ");
		double temp = Math.sqrt(Math.pow((x2 - x), 2) + Math.pow((y2 - y), 2));
		System.out.println(temp);
	}

	void ToP3(Points p3){
			System.out.println("Distance between p1 and p3: ");
			double temp = Math.sqrt(Math.pow((p3.x - x), 2) + Math.pow((p3.y - y), 2));
			System.out.println(temp);
	}

	public static void main(String args[]){
			Scanner sc = new Scanner (System.in);
			System.out.print("Input the coordinates of p1: ");
			double x1 = sc.nextFloat();
			double y1 = sc.nextFloat();
			Points p1 = new Points(x1,y1);

			System.out.print("Input the coordinates of p2: ");
			double x2 = sc.nextFloat();
			double y2 = sc.nextFloat();
			Points p2 = new Points(x2,y2);

			System.out.print("Input the coordinates of p3: ");
			double x3 = sc.nextFloat();
			double y3 = sc.nextFloat();
			Points p3 = new Points(x3,y3);

			System.out.println("p1 = " + x1 + "," + y1);
			System.out.println("p2 = " + x2 + "," + y2);
			System.out.println("p3 = " + x3 + "," + y3);

			p1.ToP2(x2,y2);
			p1.ToP3(p3);
		}
}
