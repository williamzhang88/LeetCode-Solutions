 public String reverseWords(String s)
    {
        int beg = 0; 
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ')
            {
                String newstr = s.substring(beg, i);
                StringBuilder str2 = new StringBuilder();
                for (int j = newstr.length() - 1; j >= 0; j--)
                {
                    str2.append(newstr.charAt(j));
                }
                str2.append(" ");
                String tt = str2.toString();
                str.append(tt);                    
                beg = i + 1;
            }
        }
        String newstr = s.substring(beg);
        StringBuilder str2 = new StringBuilder();
        for (int j = newstr.length() - 1; j >= 0; j--)
        {
            str2.append(newstr.charAt(j));
        }
        String tt = str2.toString();
        str.append(tt);                    
       
        return str.toString();
    }
