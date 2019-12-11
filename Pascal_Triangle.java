 public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        List<Integer> arr = new ArrayList<>();
        if (numRows == 0)
        {
            return ret;
        }
        arr.add(1);
        ret.add(arr);
        int i = 1;
        while(i< numRows) 
        {
            List<Integer> arr2 = new ArrayList<>();
            arr2.add(1);
            List<Integer> arr3 = ret.get(i - 1);
            for (int ii = 0; ii < arr3.size() - 1; ii++)
            {
                arr2.add(arr3.get(ii) + arr3.get(ii +1));
            }
            arr2.add(1);
            ret.add(arr2);
            i++;
        }
        return ret;
        
    }
