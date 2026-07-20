class Node{
    int val;
    Node left,right;

    Node(int val){
        this.val=val;
    }
}

class LCA{
    Node lowestCommonAncestor(Node root,int p,int q){
        Node current=root;

        while(current!=null){
            if(p<current.val&&q<current.val){
                current=current.left;
            }else if(p>current.val&&q>current.val){
                current=current.right;
            }else{
                return current;
            }
        }

        return null;
    }
}