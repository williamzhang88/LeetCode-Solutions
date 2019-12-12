public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode x = headA;
        while ( x != null)
        {
            arr.add(x);
            x = x.next;
        }
        ListNode xx = headB;
        while ( xx != null)
        {
            if (arr.contains(xx))
            {
                return xx;
            }
            xx = xx.next;
        }
        return null;
    }
