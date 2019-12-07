  public ListNode oddEvenList(ListNode head)
    {
        List<ListNode> lister = new ArrayList<>();
        ListNode cur = head;
        int i = 1;
        int j = 0;
        while(cur != null)
        {
           if (i % 2 == 1)
           {
               lister.add(j, cur);
               j++;
           }
            else
            {
                lister.add(cur);
            }
            i++;
            cur = cur.next;
        }
  
        ListNode front = new ListNode(0);
        front.next = null; 
        while(!lister.isEmpty())
        {
            ListNode x = lister.get(lister.size() - 1);
            x.next = front.next;
            front.next = x;
            lister.remove(lister.size() - 1);
        }
        return front.next;
    
    }
