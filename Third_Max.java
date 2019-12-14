      public int thirdMax(int[] nums) 
      {
            Arrays.sort(nums);       
            ArrayList<Integer> arr = new ArrayList<>();
            int minus = 1;
            while ( nums.length - minus != -1)
            {
                if (!arr.contains(nums[nums.length - minus]))
                {
                    arr.add(nums[nums.length - minus]);
                }
                if (arr.size() == 3)
                {
                    return arr.get(2);
                }
                minus++;
            }
            return nums[nums.length - 1];   
       }
