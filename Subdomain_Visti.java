public List<String> subdomainVisits(String[] cpdomains)
    {
        List<String> lister = new ArrayList<>();
        Map<String, Integer> hm = new HashMap<>();
        for ( int i = 0; i < cpdomains.length; i++)
        {
            String str = cpdomains[i];
            int index = str.indexOf(" ");
            String num = str.substring(0, index); 
            for (int j = index; j <str.length(); j++)
            {
                if(str.substring(j, j+1).equals("."))
                {
                    if(!hm.containsKey(str.substring(index + 1)))
                    {
                         hm.put(str.substring(index + 1), Integer.parseInt(num));
                        index = j;
                    }
                    else
                    {
                        hm.put(str.substring(index + 1),hm.get(str.substring(index + 1)) + Integer.parseInt(num));
                        index = j;
                    }
                }
            }
             if(!hm.containsKey(str.substring(index + 1)))
                    {
                         hm.put(str.substring(index + 1), Integer.parseInt(num));
                        
                    }
                    else
                    {
                        hm.put(str.substring(index + 1), hm.get(str.substring(index + 1)) + Integer.parseInt(num));
                        
                    }
        }
        for (Map.Entry<String, Integer> mapper : hm.entrySet())
        {
            lister.add(String.valueOf(mapper.getValue()) + " " + mapper.getKey());
        }
        return lister;
    }
