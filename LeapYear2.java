import java.util.*; //importing

public class LeapYear2 //Purpose: determining if the year is a leap year
{
    public static void main (String [] args) //main method
    {
        Scanner keyboard = new Scanner (System.in); //will scan thew keyboard later
        int year; //declaring the variable year
        boolean leap = false;
        System.out.println("Press the 0 key to quit");
        do
        {
            System.out.println("To determine a leap year, enter the year: "); //tells user directions
            year = keyboard.nextInt(); //allows user to input a year
            if (year != 0) //will execute if the number is not a 0
            {
                if (year < 1582) //if year is less than 1582 an error message will be shown
                {
                    System.out.println("Error. Please enter a year greater than 1582");
                }
                else
                {
                    if(year%4==0) //if the year is divided by 4 and the remainder is not 0, the year in a leap year
                    {
                        leap = true;
                    }
                    else if(year%400==0) //if the year is divided by 400 and the remainder is not 0, the year is a leap year
                    {
                        leap = true;
                    }
                    else if(year%100!=0) //if the year is divided by 100 and the remainder is 0, the year in not a leap year
                    {
                        leap = false;
                    }
                    if (leap == true) //if leap is true, the program will tell user it is a leap year
                    {
                        System.out.println("The year " + year + " is a leap year");
                    }
                    if (leap == false) //if leap is false it will tell user that it is not a leap year
                    {
                        System.out.println("The year " + year + " is not a leap year");
                    }
                }
            }
            leap = false;
        }
        while(year != 0);
    }
}
