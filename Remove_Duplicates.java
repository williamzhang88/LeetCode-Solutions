public int removeDuplicates(int[] nums)
    {
        ArrayList<Integer> set = new ArrayList();
        for (int i = 0; i < nums.length; i++)
        {
            if (!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
        }
        Iterator<Integer> it = set.iterator();
        for (int i = 0; i < set.size(); i++)
        {
            nums[i] = it.next();
        }
        
        return set.size();
     
    }
