 public boolean isPalindrome(ListNode head)
    {
      
        ListNode begin = head;
        ListNode dup = head;
        
        ArrayList<Integer> arr = new ArrayList<>();
        while (begin != null)
        {
            arr.add(0, begin.val);
            begin = begin.next;
        }
        
        while (dup != null)
        {
            if(dup.val != arr.get(0))
            {
                return false;
            }
            arr.remove(0);
            dup = dup.next;
        }
        return true;
    }
