public int[] productExceptSelf(int[] nums) 
    {
        int [] nu = new int[nums.length];
        int j = 1;
        int zerocount = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0)
            {
                zerocount++;
                continue;
            }
           j *= nums[i];
        }
        for (int i = 0; i < nums.length; i++)
        {
            if (zerocount >= 2)
            {
                nu[i] = 0;
            }
            else if (zerocount == 1 && nums[i] == 0)
            {
                nu[i] = j;
            }
            else if (zerocount == 1 && nums[i] != 0)
            {
                nu[i] = 0;
            }
            else
            {
             nu[i] = j / nums[i];
            }
        }
        return nu;
    }
