public int findPeakElement(int[] nums)
    {
        if (nums.length == 1)
        {
            return 0;
        }
         if (nums.length == 2)
        {
            return nums[1] > nums[0] ? 1 : 0;
        }
        int largest = nums[0];
        int largest2 = nums[nums.length -1];
        for (int i = 1; i < nums.length - 1; i++)
        {
            if (nums[i] > nums[i-1] && nums[i] > nums[i+1] && nums[i] > largest)
            {
                return i;
            }
        }
        if (largest > largest2)
        {
            return 0;
        }
        else
        {
            return nums.length -1;
        }
    }
