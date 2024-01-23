// name:vishweshwar shinde
// reg : 230970059
// prog : 1. Write a java program that takes date as input, adds a specified number of   days to it, and
// then displays the resulting date.

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter date in DD:MM:YYYY format");

        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yyyy = sc.nextInt();
        System.out.println("entered date :" + dd +":"+mm+":"+yyyy);

        System.out.println("enter no of days you wish to add:");
        int day = sc.nextInt();

        //resulting date
       
        int newday;

        if(day>=365){
            yyyy++;
        }
        else if(day>=31){
            mm++;
        }
        else{
            if(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12){

            newday = dd + day;
            int d = newday - 31;

            if(newday>31){
                mm++;
                if(mm>=12){
                    mm = mm - 12;
                    yyyy++;
                }
                System.out.println(d +":"+ mm +":"+yyyy); 
            }
        }


        else if(mm==2){
            newday = dd + day;
            int d = newday - 29;

            if(newday>29){
                mm++;
                if(mm>=12){
                    mm = mm - 12;
                    yyyy++;
                }
                System.out.println(d +":"+ mm +":"+yyyy); 
            }

        }

        else{
            newday = dd + day;
            int d = newday - 30;

            if(newday>30){
                mm++;
                if(mm>=12){
                    mm = mm - 12;
                    yyyy++;
                }
                System.out.println(d +":"+ mm +":"+yyyy); 
            }

        }

        }


    sc.close();

        
    }    
}
