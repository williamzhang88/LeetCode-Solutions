public boolean canConstruct(String ransomNote, String magazine)
    {
        int [] nums = new int [128];
        int [] numss = new int [128];
        for (int i = 0; i < magazine.length(); i++)
        {
            int num = (int) magazine.charAt(i);
            nums[num]++;
        }
        for (int i = 0; i < ransomNote.length(); i++)
        {
            int num = (int) ransomNote.charAt(i);
            numss[num]++;
        }
        for (int i = 0; i < 128; i++)
        {
            if (numss[i] > nums[i])
            {
                return false;
            }
        }
        return true;
            
    }
