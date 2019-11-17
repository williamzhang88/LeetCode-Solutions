public void rotate(int[] nums, int k)
    {
        int [] num = new int[nums.length];
        {
            for (int i = 0; i < nums.length; i++)
            {
                int kk = (i + k )% nums.length;
                num[kk] = nums[i];
            }
        }
          for (int i = 0; i < nums.length; i++) {
            nums[i] = num[i];
        }
    }
