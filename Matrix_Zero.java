    public void setZeroes(int[][] matrix) 
    {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (matrix[i][j] == 0)
                {
                    row.add(i);
                    col.add(j);
                    
                }
            }
        }
        
        for (int x = 0; x < row.size(); x++)
        {
            zeroCol(matrix, row.get(x));
        }
        
        for (int x = 0; x < col.size(); x++)
        {
            zeroRow(matrix, col.get(x));
        }
                    
    }
    
    private void zeroCol(int[][] matrix, int l)
    {
        for (int j = 0; j < matrix[l].length; j++)
        {
            matrix[l][j] = 0;
        }
    }
    
    private void zeroRow(int[][] matrix, int l)
    {
        for (int j = 0; j < matrix.length; j++)
        {
            matrix[j][l] = 0;
        }
    }
