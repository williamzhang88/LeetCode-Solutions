    public boolean isMonotonic(int[] A)
    {
        int diff = A[0] - A[A.length - 1]; 
        for (int i = 0; i < A.length - 1; i++)
        {
            if (diff > 0)
            {
                if (A[i] < A[i + 1])
                {
                    return false;
                }
            }
            else
            {
                if (A[i] > A[i + 1])
                {
                    return false;
                }
            }
        }
        return true;
    }
