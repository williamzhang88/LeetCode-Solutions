 public String mostCommonWord(String paragraph, String[] banned) 
    {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ").split("\\s+");
        Set<String> banset = new HashSet();
        for (String word: banned) 
        {
            banset.add(word.toLowerCase());
        }
        
        int max = 1;
        StringBuilder str = new StringBuilder();
        String str2 = "";
        int x = 2;
        for (int i = 0; i < words.length; i++)
        {
            if (!banset.contains(words[i]))
            {
                if(!map.containsKey(words[i]))
                {
                    map.put(words[i], 1);
                    if (x== 2)
                    {
                        str2 += words[i];
                        x = 1;
                    }
                }
                else
                {
                    if (map.get(words[i]) + 1 > max)
                    {
                        max = map.get(words[i]) + 1;
                        str = new StringBuilder();
                        str.append(words[i]);
                    }
                    map.put(words[i], map.get(words[i]) + 1);
                }
            }
        }
        if (max == 1)
        {
            return str2;
        }
        return str.toString();
    }
