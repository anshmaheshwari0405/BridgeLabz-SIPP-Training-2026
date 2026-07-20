class Node{
    int val;
    Node left,right;
    Node(int val){
        this.val=val;
    }
}

class Search{
    boolean search(Node root,int target){
        Node current=root;
        while(current!=null){
            if(target==current.val)return true;
            if(target<current.val)
                current=current.left;
            else
                current=current.right;
        }
        return false;
    }
}