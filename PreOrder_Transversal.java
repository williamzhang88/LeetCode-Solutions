public List<Integer> preorderTraversal(TreeNode root)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        helper(arr, root);
        return arr;
    }
    private void helper(List x, TreeNode root)
    {
        if (root == null)
        {
            return;
        }
        x.add(root.val);
        if (root.left != null)
        {
            helper(x, root.left);
        }
        if (root.right != null)
        {
            helper(x, root.right);
        }
    }
