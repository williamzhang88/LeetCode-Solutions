  public int balancedStringSplit(String s) 
    {
        int x = 0;
        int left = 0, right = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.substring(i, i + 1).equals("R"))
            {
                right++;
            }
            else
            {
                left++;
            }
            if (right == left)
            {
                x++;
                left = 0; 
                right = 0;
            }
        }
        return x;
    }
