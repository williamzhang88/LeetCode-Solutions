public List<Integer> inorderTraversal(TreeNode root) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        inorderTraversal(root, arr);
        return arr;
        
    }
    public void inorderTraversal(TreeNode root, List l)
    {
        if (root == null)
        {
            return;
        }
        if (root.left != null)
        {
            inorderTraversal(root.left, l);
        }
        l.add(root.val);
        if (root.right != null);
        {
            inorderTraversal(root.right, l);
        }
    }
