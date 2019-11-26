public int firstMissingPositive(int[] nums) 
    {
        int min = 2147483647;
        int max = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for ( int i = 0; i < nums.length; i++)
        {
            if (nums[i] < min && nums[i] > 0)
            {
                min = nums[i] ;
            }
            if (nums[i] > max)
            {
                max = nums[i] ;
            }
            arr.add(nums[i]);
        }
        if (min != 1)
        {
            return 1;
        }
        else
        {
            for (int i = 1; i < max; i++)
            {
                if(!arr.contains(i))
                {
                    return i;
                }
            }
            return max + 1;
        }


    }
