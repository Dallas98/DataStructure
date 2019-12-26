package BinaryTree;

/**
 * @program: DataStructure
 * @description:ADT二叉树
 * @author: Dallas
 * @create: 2019-12-25 19:51
 */
public class BiTree {
    protected BiTreeNode root;

    public BiTree() {
        root = null;
    }

    public BiTree(DataElement e) {
        this.root = new BiTreeNode(e, null, null);
    }

    public BiTree(DataElement e, BiTreeNode lChild, BiTreeNode rChild) {
        this.root = new BiTreeNode(e, lChild, rChild);
    }

    public boolean isEmpty() {
        if (root == null)
            return true;
        return false;
    }

    public void printTree(){//树形结构打印

    }

    public BiTreeNode creatTree(DataElement e[]){
        return creat(e,0);
    }

    private BiTreeNode creat(DataElement e[],int i){
        DataElement ch =e[i];
        if (ch==null){
            root=null;
        }
        else{
            root=new BiTreeNode(e[i],null,null);
            root.lChild=creat(e ,i++);
            root.lChild=creat(e,i++);
        }
        return root;
    }

    public void preOrder() {

    }

    public void inOrder() {
        inorder(root);
    }

    public void postOrder() {

    }

    public void levelOrder() {

    }

    public int height(){
        return 0;
    }

    public int treeLeavesCount(){
        return 0;
    }

    public int treeNodeCount(){
        return 0;
    }

    public void destroyTree(){

    }

    public void copyTree(BiTree root){

    }

    private void inorder(BiTreeNode p){
        if(p!=null){
            inorder(p.lChild);
            System.out.print(p.info+" ");
            inorder(p.rChild);
        }
    }
}
