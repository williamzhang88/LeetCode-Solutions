public int[] distributeCandies(int candies, int num_people)
    {
        int[] nums = new int[num_people];
        int i = 0;
        int start = 1;
        while(candies != 0)
        {
            if (start > candies)
            {
                nums[i] += candies;
                break;
            }
            nums[i] += start;
            candies -= start;
            start++;
            i = (i + 1) % num_people;
        }
        return nums;
    }
