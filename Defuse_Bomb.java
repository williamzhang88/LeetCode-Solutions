public int[] decrypt(int[] code, int k) 
    {
        boolean negative = true;
        if (k == 0)
            return new int[code.length];
        else if ( k > 0)
        {
            negative = false;
        }
        int [] newnum = new int[code.length];
        for (int i = 0; i < newnum.length; i++)
        {
            int sum = 0;
            if (negative == false)
            {
                for (int x = 0; x < k; x++ )
                {
                    sum = sum + code[(i + 1 + x) % code.length];
                }
            }
            else
            {
                for (int x = 0; x < k * -1; x++ )
                {
                    int adder = i - 1 - x;
                    if (adder < 0)
                    {
                        sum += code[code.length + adder];
  
                    }
                    else
                    {
                        sum += code[adder % code.length];
                    }
                }
            }
            newnum[i] = sum;
        }
        return newnum;
    }
