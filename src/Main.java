import BinaryTree.BinaryTree;


/**
 * @program: DataStructure
 * @description: test主函数
 * @author: Dallas
 * @create: 2019-12-24 10:36
 */
public class Main {
    public static void main(String[] args) {
//        DataElement []e=new StringElement[10];
//        //{"a",null,"b","c","d",null,"e"}
//
//        BiTree biTree=new BiTree();
//        biTree.creatTree(e);

        BinaryTree<Integer> binaryTree=new BinaryTree<Integer>();
        Integer e[]={11,2,4,51,null,10,12,21,13,14,15,null,16};
        binaryTree.root=binaryTree.creatTree(e);
        binaryTree.preOrder();
        binaryTree.inOrder();
        binaryTree.postOrder();
        binaryTree.levelOrder();
        ;
        System.out.println(binaryTree.Judge_BST());
    }
}
