  public boolean isIsomorphic(String s, String t)
    {
        if (s.length() != t.length())
        {
            return false;
        }
        Map<Character, Character> hm = new HashMap<>();
        Map<Character, Character> hm2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);
            if (hm.containsKey(c1))
            {
                if (hm.get(c1) != c2)
                {
                    return false;
                }
            }

            if (hm2.containsKey(c2))
            {
                if (hm2.get(c2) != c1)
                {
                    return false;
                }
            }
            hm.put(c1, c2);
            hm2.put(c2, c1);
            
        }
        return true;
    }
