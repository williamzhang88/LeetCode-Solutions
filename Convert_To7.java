public String convertToBase7(int num)
    {
        if (num == 0)
        {
            return "0";
        }
        boolean truth = false;
        if (num < 0)
        {
            truth = true;
            num *= -1;
        }
        Stack<String> sta = new Stack<>();
        while(num != 0)
        {
            sta.push(String.valueOf(num % 7));
            num /= 7;
        }
        StringBuilder str = new StringBuilder();
        while(!sta.isEmpty())
        {
            if (truth)
            {
                str.append("-");
                truth = false;
            }
            str.append(sta.pop());
        }
        return str.toString();
    }
