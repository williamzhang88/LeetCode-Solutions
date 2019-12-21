public class MyHashSet 
{
    private int [] nums;
    private int count;
    
    public MyHashSet() 
    {
        nums = new int[10];
        count = 0;
    }
    
    public void add(int key)
    {
        if(contains(key))
        {
            return;
        }
        if (count == nums.length)
        {
            int [] newnums = new int[nums.length * 2];
            for (int i = 0; i < nums.length; i++)
            {
                newnums[i] = nums[i];
            }
            newnums[count] = key;
            nums = newnums;
            count++;
        }
        else
        {
            nums[count] = key;
            count++;
        }
    }
    
    public void remove(int key)
    {
        boolean tru = false;
        if (contains(key))
        {
            tru = true;
        }
        for (int i = 0; i < count; i++)
        {
            if(nums[i] == key)
            {
                for (int j = i + 1; j < count; j++)
                {
                    nums[j - 1] = nums[j];
                }
            }
        }
        if (tru)
        {
            count--;
        }
    }
    
    public boolean contains(int key)
    {
        for (int i = 0; i < count; i++)
        {
            if(nums[i] == key)
            {
                return true;
            }
        }
        return false;
    }
}
