 public void moveZeroes(int[] nums) 
    {
        ArrayList<Integer> james = new ArrayList();
        int x = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                james.add( x, nums[i]);
                x++;
            }
            else
            {
                james.add(nums[i]);
                
            }
        }
        for (int i = 0; i < james.size(); i++)
        {
            nums[i] = james.get(i);
        }
    }
