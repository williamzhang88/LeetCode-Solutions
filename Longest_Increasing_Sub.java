   public int lengthOfLIS(int[] nums)
    {
        if (nums == null || nums.length == 0)
        {
            return 0;
        }
        int [] nu = new int[nums.length];
        nu[nums.length - 1] = 1;
        int max = 1;
        for (int i = nums.length - 2; i >= 0; i--)
        {
            boolean execute = false;
            for (int j = i; j < nums.length; j++)
            {
                if(nums[i] < nums[j])
                {
                    nu[i] = Math.max(nu[i], nu[j]+ 1);
                    execute = true;
                }
            }
            if (!execute)
            {
                nu[i] = 1;
            }
            if (nu[i] > max )
            {
                max = nu[i];
            }
        }
        return max;
    }
