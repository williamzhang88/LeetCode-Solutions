  public boolean isValidSudoku(char[][] board)
    {
        ArrayList<Integer> arr = new ArrayList<>();
         HashMap<Integer, List> james = new HashMap<>();
         HashMap<Integer, List> james2 = new HashMap<>();
        for (int i = 0; i < 9; i++)
        {
           
            for (int j = 0; j < 9; j++)
            {
                if (board[i][j] != '.')
                {
                    
                     List<Character> tempor = james2.get((i / 3) * 3 + j / 3);
                    if (tempor != null && tempor.contains(board[i][j]))
                    {
                        return false;
                    }
                    else
                    {
                        if (tempor != null)
                        {
                            tempor.add(board[i][j]);
                            james2.put((i / 3) * 3 + j / 3, tempor);
                        }
                        else
                        {
                            tempor = new ArrayList<Character>();
                            tempor.add(board[i][j]);
                            james2.put((i / 3) * 3 + j / 3, tempor);
                        }
                    }
                    
                    List<Character> temp = james.get(i);
                    if (temp != null && temp.contains(board[i][j]))
                    {
                        return false;
                    }
                    else
                    {
                        if (temp != null)
                        {
                            temp.add(board[i][j]);
                            james.put(i, temp);
                        }
                        else
                        {
                            temp = new ArrayList<Character>();
                            temp.add(board[i][j]);
                            james.put(i, temp);
                        }
                    }
                    
                    
                    
                    List<Character> temp2 = james.get(j + 10);
                    if (temp2 != null && temp2.contains(board[i][j]))
                    {
                        return false;
                    }
                    else
                    {
                        if (temp2 != null)
                        {
                            temp2.add(board[i][j]);
                            james.put(j + 10, temp2);
                        }
                        else
                        {
                            temp2 = new ArrayList<Character>();
                            temp2.add(board[i][j]);
                            james.put(j + 10, temp2);
                        }
                    }
                 
                }
               
            }
        }
                    return true;
    }
