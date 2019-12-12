 public int[] constructRectangle(int area) 
    {
        int [] nums = new int[2];
        for (int i = (int)Math.sqrt(area); i >= 1; i--)
        {
            if (area % i == 0)
            {
                nums[0] = area / i;
                nums[1] = i;
                return nums;
            }
        }
        return nums;
    }
