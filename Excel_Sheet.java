 public int titleToNumber(String s) 
    {
        int length = s.length() - 1;
        int total = 0; 
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            int x = (int) ch;
            x -= 64;
            total += x * Math.pow(26, length);          
            length--;            
        }
        return total;
    }
