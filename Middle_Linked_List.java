
    public ListNode middleNode(ListNode head)
    {
        int total = 0;
        ListNode lister = head;
        while(lister.next != null)
        {
            lister = lister.next;
            total++;
            
        }
        for(int i = 0; i < (total + 1) / 2 ; i++)
        {
            head = head.next;
        }
        return head;
    }

