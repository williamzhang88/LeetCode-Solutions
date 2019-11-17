class Solution {
    public boolean isPowerOfThree(int n) 
    {
        if (n == 2 || n ==0)
        {
            return false;
        }
        else if (n == 3 || n == 1 || n == 9)
        {
            return true;
        }
        else 
        {
            return helper(n) == 3;
        }
        
    }
    public int helper(int x)
    {
        if (x / 3 == 3 && x % 3 == 0)
        {
            return 3;
        }
        else if (x % 3 == 0)
        {
            return helper(x/3);
        }
        else
        {
            return 1;
        }
    }
}
