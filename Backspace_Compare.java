 public boolean backspaceCompare(String S, String T) 
    {
        StringBuilder newS = new StringBuilder();
        int index = -1;
        for (int i = 0; i < S.length(); i++ )
        {
            if (S.charAt(i) != '#')
            {
                index++;
                newS.append(S.charAt(i));
            }
            else if (index >= 0)
            {
                newS.delete(index, index + 1);
                index--;
            }
        }
        
        
        
        
        StringBuilder newT = new StringBuilder();
        int indexx = -1;
        for (int i = 0; i < T.length(); i++ )
        {
            if (T.charAt(i) != '#')
            {
                indexx++;
                newT.append(T.charAt(i));
            }
            else if (indexx >= 0)
            {
                newT.delete(indexx, indexx + 1);
                indexx--;
            }
        }
            
            
        return newS.toString().equals(newT.toString());
    }
