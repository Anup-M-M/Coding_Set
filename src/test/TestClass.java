package test;

//Implement a method to insert a node into a binary search tree (BST) in Java.
public class TestClass {
    public static void main(String[] args) {



    }

    public static TreeNode insert(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }

        if(val < root.data){
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }

        return root;
    }
}

class TreeNode{
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}
