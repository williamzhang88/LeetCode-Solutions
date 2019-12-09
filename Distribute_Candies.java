 public int distributeCandies(int[] candies) 
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int diff = 0;
        for (int i = 0; i < candies.length; i++)
        {
            if(!hm.containsKey(candies[i]))
            {
                hm.put(candies[i], 1);
                diff++;
            }               
        }
        return Math.min( candies.length / 2, diff);
    }
