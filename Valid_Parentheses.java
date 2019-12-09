 public boolean isValid(String s)
    {
        HashMap<String, String> mapper = new HashMap<>();
        mapper.put("(", ")");
        mapper.put("[", "]");
        mapper.put("{", "}");
        Stack<String> sta = new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            String ss = s.substring(i, i+1);
            if(mapper.containsKey(ss))
            {
                sta.push(ss);
            }
            else
            {
                if(sta.isEmpty())
                {
                    return false;
                }
                String str = sta.peek();
                sta.pop();
                if (!mapper.get(str).equals(ss))
                {
                    return false;
                }
                            
            }
        }
  
        return sta.isEmpty();
    }
