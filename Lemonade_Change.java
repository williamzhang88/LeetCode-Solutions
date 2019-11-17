 public boolean lemonadeChange(int[] bills)
    {
        int total5 = 0;
        int total10 = 0;
        int total20 = 0;
        for (int i = 0; i < bills.length; i++)
        {
            if (bills[i] == 5)
            {
                total5 ++;
            }
            if (bills[i] == 10)
            {
                if (total5 == 0)
                {
                    return false;
                }
                else
                {
                    total5--;
                    total10++;
                }

            }
            if (bills[i] == 20)
            {
                if (total5 >= 1 && total10 >=1)
                {
                    total5--;
                    total10--;
                    total20++;
                }
                else if (total5 >= 3)
                {
                    total5 -= 3;
                    total20++;
                }
                else
                {
                    return false;
                }
            }
            
        }
        return true;
    }
