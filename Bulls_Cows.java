public String getHint(String secret, String guess) 
  {
        int a = 0;
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        for (int i = 0; i < secret.length(); i++)
        {
            if (secret.charAt(i) == guess.charAt(i))
            {
                a++;
            }
            else
            {
                arr.add(secret.substring(i, i + 1));
                arr2.add(guess.substring(i, i + 1));
            }
        }
        int total = 0;
        for (String str : arr)
        {
            if(arr2.contains(str))
            {
                arr2.remove(str);
                total++;
            }
        }
        
        return String.valueOf(a) + "A" + String.valueOf(total) + "B";
    }
