class Node{
    int val;
    Node left,right;
    Node(int val){
        this.val=val;
    }
}

class PostOrder{
    void deleteFolderTree(Node node){
        if(node==null)return;

        deleteFolderTree(node.left);
        deleteFolderTree(node.right);
        deleteNode(node);
    }

    void deleteNode(Node node){
        System.out.println("Deleting "+node.val);
    }
}