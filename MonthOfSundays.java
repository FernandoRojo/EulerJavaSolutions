import java.util.Calendar;


public class MonthOfSundays{
	public static void main(String[] args) {
		int weekday = 2;
		int year = 1901;
		int month = 1;
		int dayCount = 1;
		int dayLimit = 30;
		int sundays = 0;
		while(year < 2001){
			switch (month)
			{
			case 1: dayLimit = 31;
			break;
			case 2: if (year%4 == 0) 
				dayLimit = 29;
			else dayLimit = 28;
			break;
			case 3: dayLimit = 31;
			break;
			case 4: dayLimit = 30;
			break;
			case 5: dayLimit = 31;
			break;
			case 6: dayLimit = 30;
			break;
			case 7: dayLimit = 31;
			break;
			case 8: dayLimit = 31;
			break;
			case 9: dayLimit = 30;
			break;
			case 10: dayLimit = 31;
			break;
			case 11: dayLimit = 30;
			break;
			case 12: dayLimit = 31;
			break;
			}
		while (dayCount <= dayLimit){
			if (dayCount==1&&weekday==0)
				sundays += 1;
			weekday = ((weekday+1)%7);
			dayCount+=1;
			}
		dayCount = 1;
		month+=1;
		if (month == 13){
			year+=1;
			month = 1;
		}
		}
		System.out.println(sundays);
	}

}
