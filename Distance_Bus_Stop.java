public int distanceBetweenBusStops(int[] distance, int start, int destination)
    {
        int comp1 = 0, comp2 = 0;
        int min = Math.min(start, destination);
        int max = Math.max(start, destination);
        for (int i = min; i < max; i++)
        {
            comp1 += distance[i];
        }
        int j = max;
        while ( j != min)
        {
            comp2 += distance[j];
            j = (j + 1) % distance.length;
        }
        return Math.min(comp1, comp2);
    }
