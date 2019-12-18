public int numRookCaptures(char[][] board)
    {
        for (int i = 0; i < board.length; i++)
        {
             for (int j = 0; j < board[0].length; j++)
             {
                 if (board[i][j] == 'R')
                 {
                     return helper(board, i, j);
                 }
             }
        }
        return 0;
    }
    
    private int helper(char[][] board, int x , int y)
    {
        int count = 0;
        for (int i = x; i >= 0; i--)
        {
            if (board[i][y] == 'B')
            {
                break;
            }
             if (board[i][y] == 'p')
            {
                count++;
                break;
            }
        }
        for (int i = y; i >= 0; i--)
        {
            if (board[x][i] == 'B')
            {
                break;
            }
             if (board[x][i] == 'p')
            {
                count++;
                break;
            }
        }
        for (int i = x; i <  8; i++)
        {
            if (board[i][y] == 'B')
            {
                break;
            }
             if (board[i][y] == 'p')
            {
                count++;
                break;
            }
        }
        for (int i = y; i < 8; i++)
        {
            if (board[x][i] == 'B')
            {
                break;
            }
             if (board[x][i] == 'p')
            {
                count++;
                break;
            }
        }
        return count;               
    }
