 public boolean judgeCircle(String moves)     
    {
        int up = 0, right = 0;
        for (int i = 0; i < moves.length(); i++)
        {
            char x = moves.charAt(i);
            if (x == 'U')
            {
                up++;
            }
            if (x == 'D')
            {
                up--;
            }
            if (x == 'R')
            {
                right++;
            }
            if (x == 'L')
            {
                right--;
            }
        }
        return up == 0 && right == 0;
    }
