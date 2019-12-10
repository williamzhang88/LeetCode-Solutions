 public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode prev = null;
        ListNode cur = head;
        ListNode cur2 = head;
        int x = 0;
        while (cur != null)
        {
            cur = cur.next;
            x++;
        }
        int y = x - n;
        int z = 0;
        
        while (z != y)
        {
            prev = cur2;
            cur2 = cur2.next;
            z++;
        }
        
        
        if (n == x)
        {
            return head.next;
        }
        
        prev.next = cur2.next;
        
        return head;
    }
