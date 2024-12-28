class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode>q=new LinkedList<>();
         q.add(root);
         while(!q.isEmpty()){
            int n=q.size();
            List<Integer>temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode c=q.poll();
                temp.add(c.val);
            
                if(c.left!=null){
                    q.add(c.left);
                }
                if(c.right!=null){
                    q.add(c.right);
                }
            }
                list.add(temp);
            
           
         }
          return list;
    
    }  
}
