public int kthSmallest(TreeNode root, int k)
    {
        ArrayList<Integer> x = new ArrayList<>();
        helper(x, root);
        return x.get(k - 1);
    }
    
    private void helper(List arr, TreeNode root)
    {
        if (root.left != null)
        {
             helper( arr, root.left);
        }
        arr.add(root.val);
        if (root.right != null)
        {
             helper(arr, root.right);
        }
    }
