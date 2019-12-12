  public String longestCommonPrefix(String[] strs)  
    {
        if (strs.length == 0)
        {
            return "";
        }
        String s = strs[0];
        String str = strs[0];
        for ( int i = 1; i < strs.length; i++)
        {
                String newstr = strs[i];
                String newS = "";
                for (int ii = 0; ii < str.length(); ii++)
                {
                    if (ii == newstr.length())
                    {
                        break;
                    }
                    if (newstr.charAt(ii) == str.charAt(ii))
                    {
                     newS += newstr.substring(ii, ii + 1);
                    }
                    else
                    {
                        break;
                    }
                }
                if (newS.length() < s.length())
                {
                    s = newS;
                }
            str = newstr;
                      
                
        }
     
        return s;
    }
