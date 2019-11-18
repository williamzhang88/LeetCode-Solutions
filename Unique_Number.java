public boolean uniqueOccurrences(int[] arr) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            if (!map.containsKey(arr[i]))
            {
                map.put(arr[i], 1);
            }
            else
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        ArrayList<Integer> ar = new ArrayList();
        for (int k : map.values())
        {
            if (ar.contains(k))
            {
                return false;
            }
            else
            {
                ar.add(k);
            }
        }
        return true;
    }
