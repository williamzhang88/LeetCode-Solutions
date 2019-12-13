public int calPoints(String[] ops) 
    {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for ( int i = 0; i < ops.length; i++)
        {
     
            if (ops[i].equals("+"))
            {
                int sum2 = stack.pop();
                if (stack.isEmpty())
                {
                     stack.push(sum2);
                     stack.push(sum2);
                     sum += sum2;
                }
                else
                {
                    int sum3 = stack.pop();
                    stack.push(sum3);
                    stack.push(sum2);
                    stack.push(sum2 + sum3);
                    sum += sum2 + sum3;
                }
            }
            else if (ops[i].equals("C"))
            {
                int x = stack.pop();
                sum -= x;
            }
            else if (ops[i].equals("D"))
            {
                int x = stack.peek();
                stack.push(2 * x);
                sum += 2 * x;
            }
            else 
            {
                sum += Integer.parseInt(ops[i]);
                stack.push(Integer.parseInt(ops[i]));
            }
        }
        return sum;
    }
