//program to demonstrate calender class

import java.util.*;

class CalendarClassEx
{
	public static void main(String ar[])
	{
		Calendar cal = Calendar.getInstance();
		
		System.out.println("cal: "+cal);
		System.out.println("cal.getTime: "+cal.getTime());
		System.out.println("cal.getTimeZone().getID(): "+cal.getTimeZone().getID());
		System.out.println("cal.getCalendarType(): "+cal.getCalendarType());
		
		System.out.println("cal.get(Calendar.DAY_OF_WEEK_IN_MONTH): "+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	}
}	
		