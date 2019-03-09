import java.util.*;
class DateFinder
{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input Date (dd/mm/yyyy):");
        String input=s.next();
        String [] arr=input.split("/");
        int numDays[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int date=Integer.parseInt(arr[0]);
        int month=Integer.parseInt(arr[1]);
        int year=Integer.parseInt(arr[2]);

        

        boolean dateCheck=false;

        if(isLeapYear(year))
        {
            numDays[1]=29;
        }

        try
        {
            if(date <=numDays[month-1] && date>0)
            {
                if(month<13 && month>0)
                {
                    if(year>0)
                    {
                        dateCheck=true;
                    }
                }
            }
        }
        catch(Exception E)
        {
            System.out.println("Invalid Date!");
            System.exit(0);
        }

        numDays[1]=28;

        if(!dateCheck)
        {
            System.out.println("Invalid Date!");
            System.exit(0);
        }
        
        System.out.println("Input No. of Days:");
        int diff=s.nextInt();
        
        

        for(;diff>0;diff--)
        {
            date++;
            if(isLeapYear(year))
            {
                numDays[1]=29;
            }
            if(date>numDays[month-1])
            {
                date=1;
                month++;
                if(month>12)
                {
                    year++;
                    month=1;
                }
            }
            numDays[1]=28;
        }
        System.out.println("Output:\n"+date+"/"+month+"/"+year);
    }

    static boolean isLeapYear(int year)
    {
        if(year%100==0)

        {
            if(year%400==0)
            {
                return true;
            }
        }
        else if(year%4==0)
        {
            return true;
        }
        return false;
    }
    /**
     * The Key Value Method

This method uses codes for different months and years to speed up the calculation of the day of the week. You might even be able to memorize the codes. We'll use December 16, 2482 as an example.

Take the last 2 digits of the year. In our example, this is 82.

Divide by 4, and drop any remainder. 82 / 4 = 20, remainder 2, so we think "20."

Add the day of the month. In our example, 20 + 16 = 36.

Add the month's key value, from the following table.
Jan	Feb	Mar	Apr	May	June	July	Aug	Sept	Oct	Nov	Dec
1	4	4	0	2	5	0	3	6	1	4	6

The month for our example is December, with a key value of 6. 36 + 6 = 42.

If your date is in January or February of a leap year, subtract 1. We're using December, so we don't have to worry about this step.

Add the century code from the following table. (These codes are for the Gregorian calendar. The rule's slightly simpler for Julian dates.)
1700s	1800s	1900s	2000s
4	2	0	6

Our example year is 2482, and the 2400s aren't in the table. Luckily, the Gregorian calendar repeats every four hundred years. All we have to do is add or subtract 400 until we have a date that is in the table. 2482 - 400 = 2082, so we look at the table for the 2000s, and get the code 6. Now we add this to our running total: 42 + 6 = 48.

Add the last two digits of the year. 48 + 82 = 130.

Divide by 7 and take the remainder. This time, 1 means Sunday, 2 means Monday, and so on. A remainder of 0 means Saturday. 130 / 7 = 18, remainder 4, so December 16, 2482 will be on the fourth day of the week-- Wednesday.
       */
}