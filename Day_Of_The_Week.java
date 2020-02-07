  public String dayOfTheWeek(int day, int month, int year) 
    {
        int [] nums = {31, 28, 31, 30, 31, 30, 31, 31,30, 31, 30, 31};
        String [] dates = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
        int daycount = 0;
        for (int i = 1970; i < year; i++)
        {
            daycount += 365;
            if (i % 4 == 0)
            {
                daycount++;
            }
        }
        for ( int i = 1; i < month; i++)
        {
            daycount += nums[i - 1];
        }
        if (year % 4 == 0 && month > 2)
        {
            daycount++;
        }
        daycount += day - 1;
        return dates[daycount % 7];
        
    }
