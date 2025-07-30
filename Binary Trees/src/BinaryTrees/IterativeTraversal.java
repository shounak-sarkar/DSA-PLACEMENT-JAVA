package BinaryTrees;
import LinkedList.TreeNode;
import java.util.ArrayList;
import java.util.Stack;
public class IterativeTraversal {
    public static TreeNode createTreePreDefined() {
        // Root node
        TreeNode root = new TreeNode(1);

        // Left Subtree
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        // Right Subtree
        root.right = new TreeNode(7);
        return root;
    }

    public static ArrayList<Integer> preOrderTraversalIterative(TreeNode root) {
        ArrayList<Integer> preOrdIter = new ArrayList<>();
        if (root == null) return preOrdIter;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            root = st.pop();
            preOrdIter.add(root.data);
            if (root.right != null) {
                st.push(root.right);
            }
            if (root.left != null) {
                st.push(root.left);
            }
        }
        return preOrdIter;
    }
    public static ArrayList<Integer> inOrderTraversalIterative(TreeNode root) {
        ArrayList<Integer> inOrdIter = new ArrayList<>();
        if (root == null) return inOrdIter;
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;
        while (true) {
            if (node != null) {
                st.push(node);
                node = node.left;
            } else {
                if (st.isEmpty()) break;
                node = st.pop();
                inOrdIter.add(node.data);
                node = node.right;
            }
        }
        return inOrdIter;
    }

    public static ArrayList<Integer> postOrderTraversalIterative2stack(TreeNode root)
    {
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        ArrayList<Integer> postO=new ArrayList<>();

        if(root == null) return postO;

        st1.push(root);
        while(!st1.isEmpty()) {
            root = st1.pop();
            st2.add(root);
            if (root.left != null) st1.push(root.left);
            if (root.right != null) st1.push(root.right);
        }
        while(!st2.isEmpty()) {
            postO.add(st2.pop().data);
        }
         return postO;
        }





    public static void main(String[] args) {
        TreeOperations t=new TreeOperations();
        TreeNode root=null;
        root=createTreePreDefined();
        System.out.println("Pre order Traversal is : "+preOrderTraversalIterative(root));
        System.out.println("In Order Traversal is : "+inOrderTraversalIterative(root));
        System.out.println("Post Order Traversal is : "+postOrderTraversalIterative2stack(root));

    }
}
