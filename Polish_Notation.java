public int evalRPN(String[] tokens)
    {
        Stack<Integer> str = new Stack<>();
        for (int i = 0; i < tokens.length; i++)
        {
            String newstr = tokens[i];
            if (newstr.equals("*"))
            {
                int x = str.pop();
                int y =  str.pop();
                str.push(x * y);
            }
            else if (newstr.equals("/"))
            {
                int x = str.pop();
                int y = str.pop();
                str.push(y / x);
            }
            else if (newstr.equals("-"))
            {
                int x = str.pop();
                int y =  str.pop();
                str.push(y - x);
            }
            else if (newstr.equals("+"))
            {
                int x = str.pop();
                int y =  str.pop();
                str.push(y + x);
            }
            else
            {
                str.push(Integer.parseInt(newstr));
            }
        }
        return str.pop();
    }
