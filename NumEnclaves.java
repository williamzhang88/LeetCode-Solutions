class Solution
{
    public int numEnclaves(int[][] A) 
    {
        for (int i = 1; i < A.length - 1; i++)
        {
            for (int j = 1; j < A[i].length - 1; j++)
            {
                if(A[i][j] == 1 && boarders(A, i, j))
                {
                    
                    recurse(A, i, j);
                }
               
            }
        }
        int count = 0;
        for (int i = 1; i < A.length - 1; i++)
        {
            for (int j = 1; j < A[i].length - 1; j++)
            {
                if (A[i][j] == 1)
                {
                    count++;
                }
            }
        }
        
        return count;
       
    }
    
    private void recurse(int[][] A, int x, int y )
    {
        if ( x < 1 || y < 1 || y > A[x].length -2||x>A.length - 2)
        {
            return;
        }
        if (A[x][y] == 1)
        {
            A[x][y] = 2;
            recurse(A, x - 1, y);
            recurse(A, x + 1, y);
            recurse(A, x, y - 1);
            recurse(A, x, y + 1);
        }
    }
    private boolean boarders(int[][] A, int x, int y)
    {
        if (x -1 == 0)
        {
            if (A[x  - 1][y] == 1)
            {
                return true;
            }
        }
        if (y -1 == 0)
        {
            if (A[x][y - 1] == 1)
            {
                return true;
            }
        }
        if (x + 1 == A.length - 1)
        {
            if (A[x + 1][y] == 1)
            {
                return true;
            }
        }
        if (y + 1 == A[x].length - 1)
        {
            if (A[x][y + 1] == 1)
            {
                return true;
            }
        }
        return false;
    }
}
