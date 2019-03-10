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
        System.out.println("Output:\n"+date+"/"+month+"/"+year+" - "+getDay(date,month,year));
        
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
    
    static String getDay(int date,int month,int year)
    {
        
        int m=(month+10)%12;
        if (month==2)
            m=12;
        if(month==1||month==2)
        {
            year--;
        }
        int k=date;
        int D=year%100;
        int C=year/100;
        int F=k+((13*m-1)/5) +D+ (D/4) +(C/4)-2*C;
        int key;
        if(F<0)
        {
            key=7-(Math.abs(F)%7);
            if(key==7)
                key=0;
        }
        else
        {
            key=F%7;
        }
        String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        return days[key];
    }
}