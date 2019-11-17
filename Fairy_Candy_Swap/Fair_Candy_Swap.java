 public int[] fairCandySwap(int[] A, int[] B) 
    {
        int [] newArray = new int[2];
        int sum =0;
        int sum2 =0;
        for (int i= 0 ; i < A.length; i++)
        {
            sum+= A[i];
        }
        for (int i= 0 ; i < B.length; i++)
        {
            sum2+= B[i];
        }
        for (int i= 0 ; i < A.length; i++)
        {
            for (int ii= 0 ; ii < B.length; ii++)
            {
                if (sum - A[i] + B[ii] == sum2 + A[i] - B[ii] )
                {
                    newArray[1] = B[ii];
                    newArray[0] = A[i];
                }
            }
                
        }
        return newArray;
    }
