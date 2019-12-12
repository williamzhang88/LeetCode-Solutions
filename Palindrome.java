 public boolean isPalindrome(String s) 
    {
        StringBuilder sg = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            char left = s.charAt(i);
            if (Character.isLetterOrDigit(left))
            {
                sg.append(s.substring(i, i+1));
            }
        }
        String bob = sg.toString().toLowerCase();
               
        for (int i = 0; i < bob.length() /2 ; i++)
        {
            if(bob.charAt(i) != bob.charAt(bob.length() - 1 - i))
            {
                return false;
            }
        }
        return true;

    }
