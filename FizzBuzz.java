    public List<String> fizzBuzz(int n) 
    {
        List<String> b = new ArrayList<String>();
        for (int i = 1; i <= n; i++)
        {
            if (i % 3 == 0 && i % 5 ==0)
            {
                b.add("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
                b.add("Fizz");
            }
            else if ( i % 5 ==0)
            {
                b.add("Buzz");
            }
            else
            {
                b.add(Integer.toString(i));
            }
        }
        return b;
    }
