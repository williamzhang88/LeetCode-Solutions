public int[] nextGreaterElements(int[] nums)
    {
        int index = 0;
        int [] newnum = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            int x = nums[i];
            boolean truth = true;
            int j = (xx + 1) % nums.length;
            for (int jj= 0; jj< nums.length - 1;jj++)
            {

                    if (nums[j]> x)
                    {
                        newnum[index++] = nums[j];
                        truth = false;
                        break;
                    }
                   j = (j+ 1) % nums.length;

            }
            if (truth)
            {
                newnum[index++] = -1;
            }
        }
        return newnum;
    }
