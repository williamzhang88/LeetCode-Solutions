  public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int [] nums = new int[nums1.length + nums2.length];
        int ii = 0;
        for ( int i = 0; i < nums1.length + nums2.length; i++)
        {
            if (i <  nums1.length)
            {
                nums[i] = nums1[i];
            }
            else
            {
                nums[i] = nums2[ii];
                ii++;
            }
        }
        Arrays.sort(nums);
        double one;
        if (nums.length % 2 == 1)
        {
            one = nums[nums.length / 2];
        }
        else
        {
            one = (nums[nums.length / 2])/2.0 + (nums[((nums.length / 2) - 1)])/2.0;
        }
        return one;
    
    
            
    }
