 public ListNode removeElements(ListNode head, int val)
    {
        ListNode pre = new ListNode(10);   
        ListNode cur = head;
        pre.next = cur;
        ListNode ret = pre;
        while (cur != null)
        {
            if(cur.val == val)
            {
                ret.next = cur.next;
                cur = cur.next;
            }
            else
            {
                ret = cur;
                cur = cur.next;
            }
        }
        return pre.next;
    }
