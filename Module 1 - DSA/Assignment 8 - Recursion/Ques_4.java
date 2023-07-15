
/*

💡 **Question 4**

You need to construct a binary tree from a string consisting of parenthesis and integers.

The whole input represents a binary tree. It contains an integer followed by zero, one or two pairs of parenthesis.
 The integer represents the root's value and a pair of parenthesis contains a child binary tree with the same
 structure.
You always start to construct the **left** child node of the parent first if it exists.

**Input:** s = "4(2(3)(1))(6(5))"

**Output:** [4,2,6,3,1,5]

 */

import java.util.*;

public class Ques_4 {


    static class Node
    {
        int data;
        Node left, right;
    };

    static Node newNode(int data)
    {
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;
        return (node);
    }


        // function to return the index of close parenthesis
        static int findIndex(String str, int si, int ei)
        {
            if (si > ei)
                return -1;

            // Inbuilt stack
            Stack<Character> s = new Stack<>();
            for (int i = si; i <= ei; i++)
            {

                // if open parenthesis, push it
                if (str.charAt(i) == '(')
                    s.add(str.charAt(i));

                    // if close parenthesis
                else if (str.charAt(i) == ')')
                {
                    if (s.peek() == '(')
                    {
                        s.pop();

                        // if stack is empty, this is
                        // the required index
                        if (s.isEmpty())
                            return i;
                    }
                }
            }

            // if not found return -1
            return -1;
        }

        // function to construct tree from String
        static Node treeFromString(String str, int si, int ei)
        {

            // Base case
            if (si > ei)
                return null;

            int num = 0;
            // In case the number is having more than 1 digit
            while(si <= ei && str.charAt(si) >= '0' && str.charAt(si) <= '9')
            {
                num *= 10;
                num += (str.charAt(si) - '0');
                si++;
            }
            si--;
            // new root
            Node root = newNode(num);
            int index = -1;

            // if next char is '(' find the index of
            // its complement ')'
            if (si + 1 <= ei && str.charAt(si+1) == '(')
                index = findIndex(str, si + 1, ei);

            // if index found
            if (index != -1)
            {

                // call for left subtree
                root.left = treeFromString(str, si + 2, index - 1);

                // call for right subtree
                root.right
                        = treeFromString(str, index + 2, ei - 1);
            }
            return root;
        }


    // Driver Code
    public static void main(String[] args)
    {
        String str = "4(2(3)(1))(6(5))";
        Node root = treeFromString(str, 0, str.length() - 1);
       preOrder(root);
    }

    static void preOrder(Node node) {
//        if (node == null)
//            return;
//        System.out.printf("%d ", node.data);
//        preOrder(node.left);
//        preOrder(node.right);
        Queue<Node> nodes= new LinkedList<>();

        List<Node> listOfNodes = new ArrayList<Node>();
        //add root to the list
        traverseLevels(node, listOfNodes,nodes);
        //printing in a straight line
        //System.out.println("nodes are "+listOfNodes);
        // printing level wise
        int count = 0,level=0;

        while (count < listOfNodes.size()){
            int printLen= (int) Math.pow(2, level++);

            for (int i=count; i < printLen -1 && i < listOfNodes.size();++i){
                System.out.print(listOfNodes.get(i).data+", ");
            }
//            System.out.println();
            count = printLen-1;
        }
    }

    private static void traverseLevels(Node root, List<Node> listOfNodes, Queue<Node> nodes) {
        // TODO Auto-generated method stub
        if (root!=null){

            nodes.add(root);
            listOfNodes.add(root);
            while(!nodes.isEmpty()){

                //standard BFS
                root= nodes.poll();
                if (root.left!=null) {
                    listOfNodes.add(root.left);
                    nodes.add(root.left);
                }
                if (root.right!=null) {
                    listOfNodes.add(root.right);
                    nodes.add(root.right);
                }
            }

        }
    }

}
