package BinaryTrees;
import LinkedList.TreeNode;
import java.util.Scanner;

public class TreeOperations {
    public TreeNode createTree(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the data : ");
        int data=sc.nextInt();
        if (data == -1 )
            return null;
        TreeNode root=new TreeNode(data);
        System.out.print("Enter Left of "+root.data);
        root.left=createTree();
        System.out.print("Enter Right of "+root.data);
        root.right=createTree();
        return root;
    }
    public static TreeNode createTreePreDefined() {
        // Root node
        TreeNode root = new TreeNode(1);

        // Left Subtree
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);

        // Right Subtree
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);

        return root;
    }
    public void preOrderTraversal(TreeNode root){ //Root Left Right
        if (root == null) return;
        System.out.print(root.data+ " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public void inOrderTraversal(TreeNode root){   //Left Root Right
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data+ " ");
        inOrderTraversal(root.right);
    }
    public void postOrderTraversal(TreeNode root){   //Left Right Root
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+ " ");
    }
    public static void main(String[] args) {   
        TreeOperations bt=new TreeOperations();
        TreeNode root = bt.createTreePreDefined();
        System.out.println("\nThe Pre Order Traversal ");bt.preOrderTraversal(root);
        System.out.println("\nThe In Order Traversal ");bt.inOrderTraversal(root);
        System.out.println("\nThe Post Order Traversal ");bt.postOrderTraversal(root);
    }
}
