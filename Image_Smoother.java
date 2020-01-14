 public int[][] imageSmoother(int[][] M)
    {
        int [][] newarr = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++)
        {
            for (int j = 0; j < M[0].length; j++)
            {
                helper(M, i, j, newarr);
            }
        }
        return newarr;
    }
    
    private void helper(int[][] arr, int x , int y, int[][] ark)
    {
        int count = 0;
        int sum = 0;
        for (int i = Math.max(0, x - 1); i <= Math.min(arr.length - 1, x + 1); i++)
        {
            for (int ii = Math.max(0, y - 1); ii <= Math.min(arr[0].length - 1, y + 1); ii++)
            {
                sum += arr[i][ii];
                count++;
            }
        }
        ark[x][y] = sum / count;
        
    }
