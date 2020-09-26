public int lengthOfLongestSubstring(String s)
    {
        int max = 0;
        String comp = "";
        for (int i = 0; i < s.length(); i++)
        {
            String ss = s.substring(i, i + 1);
            int index = -1;
            for (int j = 0; j < comp.length(); j++)
            {
                if (comp.substring(j, j + 1).equals(ss))
                {
                    index = j;
                    continue;
                }             
            }
            if (index != -1)
            {
                comp = comp.substring(index + 1) + ss;
            }
            else
            {
                comp += ss;
                max = Math.max(max, comp.length());
            }
        }
        return max;
    }
