 public int reverse(int x) 
    {  
        Stack<Integer> s = new Stack();
        int xx = x;
        int neg = 1;
        if (x < 0)
        {
            neg = -1;
            xx = x * -1;
        }
        while(xx > 0)
        {
            s.push(xx % 10);
            xx = xx / 10;
        }
    
        int sum = 0;
        int i = 0;
        while(!s.isEmpty())
        {
            sum += Math.pow(10, i++) * s.pop();
        }
       
        if ( sum >= 2147483647)
        {
            return 0;
        }        
        return sum * neg;
    }
