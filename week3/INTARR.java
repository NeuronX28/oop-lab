//name : vishweshwar shinde
// reg: 230970059
import java.util.*;
public class INTARR {

    Scanner sc = new Scanner(System.in);

    int arr [] ;

    INTARR(){}

    INTARR(int size)
        {
            arr = new int [size];
        }
    void input ()
    {
        System.out.println("enter array element");
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }


    }
    void display ()
    {
        System.out.println("entered array element");
        for(int i = 0; i<arr.length; i++)
        {
           System.out.println(arr[i]);
        }


    }

    void search()
    {
        System.out.println("enter ele to search");
        int ele = sc.nextInt();
        boolean found = false;
        for(int i = 0; i<arr.length; i++)
        {
            if(ele == arr[i])
            {
                System.out.println(arr[i]);
                found = true;
                break;
            }
           
        }
        if (!found)
        {
            System.out.println("ele not found");
        }

    }

    void comapre(INTARR os ,INTARR os2)
    {
       
           if(os.arr.length != os2.arr.length)
           {
            System.out.println("array len are not equal");
            return;
            }
           
        for(int i = 0; i<arr.length; i++)
            {
                if (os.arr[i]!=os2.arr[i])
                {
                  System.out.println("array are not equal");
                  return;
                }
             

            }
            
            System.out.println("array are equal");


    }


    public static void main(String[] args) {

        INTARR os = new INTARR(5);
        os.input();
        os.display();

        INTARR os2 = new INTARR(5);
        os2.input();
        os2.display();

        os.search();
        os2.search();
        os.comapre(os, os2);
        
    }
}
