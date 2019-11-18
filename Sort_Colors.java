public void sortColors(int[] nums) 
    {
        HashMap<Integer, Integer> james = new HashMap();
        for (int i = 0; i < nums.length; i++)
        {
          
            if(james.containsKey(nums[i]))
            {
                int x = james.get(nums[i]);
                james.put(nums[i], x + 1);
            }
            else
            {
                james.put(nums[i], 1);
            }
            
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : james.entrySet())  
        {
            int x = entry.getKey();
            int y = entry.getValue();
            while (y != 0)
            {
                nums[i] = entry.getKey();
                i++;
                y--;
            }
        }
    }
