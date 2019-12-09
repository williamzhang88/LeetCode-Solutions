public int largestPerimeter(int[] A)
    {
        Arrays.sort(A);
        int x = 0, y = 0, z = 0;
        for ( int i = A.length - 1; i!= 1; i--)
        {
           x = A[i];
           y = A[i - 1];
           z = A[i - 2];
            if ( x < z + y)
            {
                return x + y + z;
            }
        }
        return 0;
    }
