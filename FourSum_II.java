public int fourSumCount(int[] A, int[] B, int[] C, int[] D)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for (int i = 0; i < A.length; i++)
        {
            for (int j = 0; j < B.length; j++)
            {
                hm.put(A[i] + B[j], hm.getOrDefault(A[i] + B[j], 0) + 1);
            }
        }
        for (int i = 0; i < C.length; i++)
        {
            for (int j = 0; j < D.length; j++)
            {
                    if (hm.get( -1 * (C[i] + D[j])) != null)
                    {
                        count += hm.get( -1 * (C[i] + D[j]));
                    }
            }
        }
        return count;
    }
