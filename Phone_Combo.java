  public List<String> letterCombinations(String digits) 
    {
        List<String> lister = new ArrayList<>();
        List<String> lister2 = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "");
        map.put(0, "");
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "prqs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        int truth = 0;
        for (int i =0 ; i < digits.length(); i++)
        {
            int x = Integer.parseInt(digits.substring(i, i + 1));
            String str = map.get(x);
            if (truth == 0)
            {
                for (int ii = 0 ; ii < str.length(); ii++)
                {
                    lister.add(str.substring(ii, ii+ 1));
                }
                truth = 1;
            }
            else
            {         
                while(!lister.isEmpty())
                {
                     for (int j = 0 ; j < str.length(); j++)
                        {
                            lister2.add(lister.get(0) + str.substring(j, j+1));
                        }
                    lister.remove(0);
                  
                }
                lister.addAll(lister2);
                lister2.clear();
         
            }
            
            
        }
        return lister;
    }
