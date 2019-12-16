  public int arrayNesting(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++)
        {
            int x = nums[i];
            int maxer = 0;
            while(!set.contains(x))
            {
                set.add(nums[i]);
                x = nums[x];
                maxer++;
            }
            if (maxer > max)
            {
                max = maxer;
            }
        }
        return max;
    }
