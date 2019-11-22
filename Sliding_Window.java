 public int[] maxSlidingWindow(int[] nums, int k) 
    {
        if (nums.length == 0)
        {
            return new int[0];
        }
        int [] n = new int[nums.length - k + 1];
        int adder = 0;
        for (int i = 0; i < nums.length - k + 1; i++)
        {
            ArrayList<Integer> arr = new ArrayList<>();
            for ( int a = i; a < i + k; a++)
            {
                arr.add(nums[a]);
            }
            n[adder++] = largest(arr);
        }
        return n;
    }
    
    private int largest(List<Integer> t)
    {
        int min = t.get(0);
        for (int i = 1; i < t.size(); i++)
        {
            if (min < t.get(i))
            {
                min = t.get(i);
            }
        }
        return min;
    }
