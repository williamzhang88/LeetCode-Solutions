 public boolean canPlaceFlowers(int[] flowerbed, int n)
    {
        if (flowerbed.length == 1 && flowerbed[0] == 0)
        {
            return true;
        }
        int counter = 0;
        int length = flowerbed.length;
        for (int i = 0; i < flowerbed.length; i++)
        {
            int j = i + 1;
            int count = 0;
            if (flowerbed[i] == 0)
            {
                if (i == 0)
                {
                    count++;
                }
                count++;
                while( j < length && flowerbed[j] != 1 )
                {
                    if ( j == length - 1 && flowerbed[j] == 0)
                    {
                        count++;
                    }
                    count++;
                    j++;
                }
                i = j;
                counter += (count - 1) / 2;
            }
        }
        return counter >= n;
    }
