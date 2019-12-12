  public int sumOfLeftLeaves(TreeNode root) 
    {
       return sumOfLeftLeaves(root, false);
    }
    private int sumOfLeftLeaves(TreeNode root, boolean b) 
    {
        if (root == null)
        {
            return 0;
        }
        if (root.right == null && root.left == null && b == false)
        {
            return 0;
        }
        if (root.right == null && root.left == null && b == true)
        {
            return root.val;
        }        
        return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
    }
