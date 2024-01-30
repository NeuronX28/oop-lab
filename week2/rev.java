import java.util.Scanner;
class Reverse{
	public static void main (String args[]) {
 	Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
		int [] arr = new int[size];
		int [] arr2=  new int[size];
		System.out.println("input"+""+size+ "intergers");
		for(int i=0; i<size; i++)
			{
			System.out.print("Element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
			int rev =0;
			int temp = arr[i];
		    while(temp !=0)
				 {
					int remainder = temp%10;
					rev = rev *10 + remainder;
					temp/=10;
				 }
				   arr2[i]= rev;
			}

		    System.out.println("ori array and  rev Array:");
			for (int i =0; i<size ; i++)
				{
				System.out.println(arr[i] + " \t" + arr2[i] + " ");
		        }

  }

}
