public int[][] matrixReshape(int[][] nums, int r, int c) 
    {
        if (r * c != nums.length * nums[0].length)
        {
            return nums;
        }
        int [][] num = new int[r][c];
        int x = 0, y = 0;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j= 0; j < nums[i].length; j++)
            {
                if (y == c )
                {
                    y = 0;
                    x++;
                }
                num[x][y] = nums[i][j];
                y++;
                
            }
        }
        return num;
        
    }
