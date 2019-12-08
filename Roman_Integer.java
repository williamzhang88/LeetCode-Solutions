 public int romanToInt(String s)
    {
        int sum = 0;
        int prev = 1001;
        for ( int i = 0; i < s.length(); i++)
        {
            int cur = helper(s.substring(i, i + 1));
            if (cur > prev)
            {
                sum = sum - prev + (cur - prev);
            }
            else
            {
                sum += cur;
            }
            prev = cur;
        }
        return sum;
    }
    
    private int helper(String s)
    {
        switch(s)
        {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
           
        }
         return -1;
    }
