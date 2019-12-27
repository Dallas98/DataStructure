package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;


/**
 * @program: DataStructure
 * @description:实现树的基本操作
 * @author: Dallas
 * @create: 2019-12-27 10:31
 */
public class BinaryTree<TypeElement> {

    //节点内部类
    private class BinaryTreeNode<TypeElement> {
        TypeElement info;
        BinaryTreeNode lChild;
        BinaryTreeNode rChild;

        BinaryTreeNode() {
            info = null;
            lChild = null;
            rChild = null;
        }

        BinaryTreeNode(TypeElement element, BinaryTreeNode lchild, BinaryTreeNode rchild) {
            info = element;
            lChild = lchild;
            rChild = rchild;
        }
    }

    public BinaryTreeNode root;


    public BinaryTree() {
        root = null;
    }

    public BinaryTree(TypeElement element) {
        root = new BinaryTreeNode(element, null, null);
    }

    //判空
    public boolean isEmpty() {
        if (root == null)
            return true;
        return false;
    }


    //数组存储构建二叉链表树
    public BinaryTreeNode creatTree(TypeElement element[]) {
        return creat(element, 0);
    }

    private BinaryTreeNode creat(TypeElement element[], int i) {
        BinaryTreeNode node = null;
        if (i < element.length) {
            TypeElement value = element[i];
            if (value == null) {
                return null;
            }
            node = new BinaryTreeNode(value, null, null);
            node.lChild = creat(element, 2 * i + 1);
            node.rChild = creat(element, 2 * i + 2);
            return node;
        }
        return node;
    }


    //递归遍历
    public void preOrder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(BinaryTreeNode root) {
        if (root != null) {
            System.out.print(root.info + " ");
            preorder(root.lChild);
            preorder(root.rChild);
        }
    }

    public void inOrder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(BinaryTreeNode root) {
        if (root != null) {
            inorder(root.lChild);
            System.out.print(root.info + " ");
            inorder(root.rChild);
        }
    }

    public void postOrder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(BinaryTreeNode root) {
        if (root != null) {
            postorder(root.lChild);
            postorder(root.rChild);
            System.out.print(root.info + " ");
        }
    }

    //层次遍历
    public void levelOrder() {
        levelorder(root);
        System.out.println();
    }

    private void levelorder(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        BinaryTreeNode p;
        queue.offer(root);
        while (queue.peek() != null) {
            p = queue.remove();
            System.out.print(p.info + " ");
            if (p.lChild != null) {
                queue.offer(p.lChild);
            }
            if (p.rChild != null) {
                queue.offer(p.rChild);
            }
        }

    }

    //求树高
    public int treeHeight() {
        return height(root);
    }

    private int height(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(height(root.lChild), height(root.rChild));
        }
    }


    //求叶子节点数
    public int treeLeavesCount() {
        return leaves(root);
    }

    private int leaves(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.rChild == null && root.lChild == null) {
            return 1;
        } else {
            return leaves(root.lChild) + leaves(root.rChild);
        }
    }

    //判断是否是平衡二叉树
    public boolean Judge_AVL() {
        return avl(root);
    }

    private boolean avl(BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        int left = height(root.lChild);
        int right = height(root.rChild);
        if (Math.abs(left - right) > 1) {
            return false;
        } else {
            return avl(root.rChild) & avl(root.lChild);
        }

    }


    //判断二叉排序树
    public boolean Judge_BST() {
        return bst(root, Integer.MIN_VALUE);
    }

    private boolean bst(BinaryTreeNode root, Integer last) {
        if (root == null) {
            return true;
        }
        if (!bst(root.lChild, last)) {
            return false;
        }
        if ((Integer) root.info < last) {
            return false;
        }
        last = (Integer) root.info;
        if (!bst(root.rChild, last)) {
            return false;
        }
        return true;
    }
}
